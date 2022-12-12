package assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
    public static void main(String[] args) {
        // write a regular expression for all 10 digits moblie number
        // rules : 1. every number should contain exaclty 10 digit 
        //         2. the first digit should be 7, 8, or 9

        // Pattern ptr = Pattern.compile("[7-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
        String regex = "(0|91)?[7-9][0-9]{9}"; //short form
        String str = "09876543210";
        Pattern ptr = Pattern.compile(regex);
        Matcher mat = ptr.matcher(str);

        if(mat.find() && mat.group().equals(str))
        {
            System.out.println("Valid mobile number...");
        }
        else
        {
            System.out.println("Invalid mobile number...");
        }


    }
}
