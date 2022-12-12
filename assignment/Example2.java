package assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 {
    public static void main(String[] args) {
        // write a regular expression for valid email id
        // rules :  email is not a case sensitive
        String email = "somusaxena@gmail.com";
        String regex = "[a-zA-Z0-9][a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";                   
        Pattern ptr = Pattern.compile(regex);
        Matcher mat = ptr.matcher(email);
        
        if (mat.find() && mat.group().equals(email)) {
            System.out.println("Valid Email Address...");
        } else {
            System.out.println("Invalid Email Address...");
        }

        
    }
}
