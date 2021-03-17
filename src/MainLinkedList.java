import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainLinkedList {
    public static void main(String[] args) {

        // ArrayList
        // [Element1, Element2, Element3]
        //    0         1         2
        // LinkedList
        // [Element1<->Element2<->Element3<->Element4]

        List<String> names1 = new ArrayList<>();
        List<String> names2 = new LinkedList<>();

        names1.add("Beata");
        names2.add("Beata");

        names1.get(0);
        names2.get(0);

        names1.remove(0);
        names2.remove(0);
    }
}
