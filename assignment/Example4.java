package assignment;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4 {
    public static void main(String[] args) {
        // wap to find all txt file name present some dir

        String regex = "[a-zA-z0-9_.$]+[.]txt";

        Pattern ptr = Pattern.compile(regex);

        File f = new File("assignment");

        String[] ls = f.list();

        for (String x : ls) {
            Matcher mat = ptr.matcher(x);

            if (mat.find() && mat.group().equals(x)) {
                System.out.println(x);
            } 
        }
    }
}
