package Streams;

import Dziedziczenie.computer.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ZadDomStreams {
    public static void main(String[] args) {

        List<Computer> computers = new ArrayList<>();
        computers.add(new Laptop("Dell Inspiron G1", "Intel Core i5", new Hdd("SATA", 512), new Ram("DDR", 128), 100));
        computers.add(new Laptop("Dell Inspiron G3", "Intel Core i7", new Hdd("SATA", 512), new Ram("DDR", 256), 90));
        computers.add(new Laptop("Dell Inspiron G4", "Intel Core i5", new Hdd("SATA", 128), new Ram("DDR", 128), 90));
        computers.add(new Laptop("Dell Inspiron G4", "Intel Core i3", new Hdd("SATA", 128), new Ram("DDR", 128), 90));
        computers.add(new Laptop("Dell Inspiron G2", "Intel Core i3", new Hdd("SATA", 512), new Ram("DDR", 128), 100));
        computers.add(new PC("HP 1", "Desktop 1", new Hdd("SATA", 1000), new Ram("DDR", 512)));
        computers.add(new PC("HP 3", "Desktop 2", new Hdd("SATA", 512), new Ram("DDR", 256)));
        computers.add(new PC("HP 2", "Desktop 3", new Hdd("SATA", 256), new Ram("DDR", 125)));
        computers.add(new PC("HP 3", "Desktop 1", new Hdd("SATA", 512), new Ram("DDR", 256)));

        // 1. Zliczyć wszystkie komputery, które mają więcej niż 128 GB RAM
        long compWithRam = computers.stream()
                .filter(ram -> ram.getRam().getSize() > 128)
                .count();
        System.out.println("Ilość komputerów z więcej niż 128 GB RAM: " + compWithRam);

        // 2. Wyświetlić wszystkie typy komputerów - map
        computers.stream()
                .map(type -> "Typ komputera: " + type.getType())
                .forEach(type -> System.out.println(type));

        // 3. Wyświetlić komputer, który ma najwięcej RAMu
        Computer maxRam = computers.stream()
                .max(Comparator.comparingInt(comp -> comp.getRam().getSize()))
                .orElseThrow(() -> new IllegalStateException("Can't find computer"));
        System.out.println("Komputer z max ilością RAMu: " + maxRam.getName());

        // 4. Utworzyć kolekcję z komputerami, które mają dysk twardy mniejszy niż 500 GB
        List<Computer> computerList = computers.stream()
                .filter(hdd -> hdd.getHdd().getSize() < 500)
                .collect(Collectors.toList());
        for (Computer comp : computerList) {
            System.out.println("Nazwa komputera: " + comp.getName());
        }

        // 5. Posortować komputery po nazwie i typie
        List<Computer> sortedComputers = computers.stream()
                .sorted(Comparator.comparing(Computer::getName).thenComparing(Computer::getType))
                .collect(Collectors.toList());
        for (Computer comp : sortedComputers) {
            System.out.println("Nazwa komputera: " + comp.getName() + " typ: " + comp.getType());
        }

        // Optional
        Optional<Computer> minRam = computers.stream()
                .min(Comparator.comparingInt(comp -> comp.getRam().getSize()));
        // get()
        // isPresent()
        if(minRam.isPresent()) {
            System.out.println("Komputer z min RAM: " + minRam.get().getName());
        } else {
            System.out.println("Nie znalazłem komputera");
        }
        // isEmpty()
        if(!minRam.isEmpty()) {
            System.out.println("Komputer z min RAM: " + minRam.get().getName());
        } else {
            System.out.println("Nie znalazłem komputera");
        }
        // orElse()
        Computer comp1 = computers.stream()
                .filter(comp -> comp.getRam().getSize() > 128)
                .findFirst()
                .orElse(maxRam);
        System.out.println(comp1.getName());
        // orElseGet()
        Computer comp2 = computers.stream()
                .filter(comp -> comp.getHdd().getSize() > 1024)
                .findFirst()
                .orElseGet(() -> new PC("HP 5", "Desktop 1", new Hdd("SATA", 1000), new Ram("DDR", 512)));
        System.out.println(comp2.getName());
        // orElseThrow()
        Computer comp3 = computers.stream()
                .filter(comp -> comp.getState() == true)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Wszystkie komputery są odłączone"));
        System.out.println(comp3.getState());
        // ifPresent()
        computers.stream()
                .filter(comp -> comp.getName().startsWith("D"))
                .findFirst()
                .ifPresent(comp -> System.out.println(comp));
        // isPresentOrElse()
        computers.stream()
                .filter(comp -> comp.getName().startsWith("H"))
                .findFirst()
                .ifPresentOrElse(comp -> System.out.println(comp), () -> System.out.println("Nie ma takiego komputera"));

        computers.stream()
                .filter(comp -> comp.getName().startsWith("M"))
                .findFirst()
                .ifPresentOrElse(comp -> System.out.println(comp), () -> System.out.println("Nie ma takiego komputera"));
    }
}
