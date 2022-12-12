package quantifier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
    public static void main(String[] args) {
        String x = "a{2,4}";
        String str = "abaabaaab";

        Pattern ptr = Pattern.compile(x);
        Matcher mat = ptr.matcher(str);

        while(mat.find())
        {
            System.out.println(mat.start()+" "+mat.end()+" "+mat.group());
        }
    }
}
