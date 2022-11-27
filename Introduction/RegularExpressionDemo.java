import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo{
    public static void main(String[] args) {
        int count = 0;
        String str = "abbabba";
        Pattern ptr = Pattern.compile("ab");

        Matcher m = ptr.matcher(str);

        while (m.find()) {
            count++;
            System.out.println(m.start() +" "+m.group());
        }
        System.out.println("Total No. Occurence : "+count);
    }
}