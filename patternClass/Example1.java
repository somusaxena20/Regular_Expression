package patternClass;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Example1 {
    public static void main(String[] args) {
        Pattern ptr = Pattern.compile("\\.");
        // String[] str = ptr.split("Durga Software Solution");

        String[] str = ptr.split("www.durgajobs.com");
        System.out.println(Arrays.toString(str));

    }
}
