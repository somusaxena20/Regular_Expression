package charcter_matching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
    public static void main(String[] args) {
        String email = "somusaxena20@gmail.com";
        String x = "\\W";

        Pattern p = Pattern.compile(x);
        Matcher m = p.matcher(email);

        while (m.find()) {
            System.out.println(m.start() +" "+m.end()+" "+m.group());
        }
    }
}
