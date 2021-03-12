package utils;

public class StringUtils {

    public String getFormattedText(String text) {

        if(text.length() < 10) {
            return text;
        } else {
            return text.substring(0, 7) + "...";
        }
    }
}
