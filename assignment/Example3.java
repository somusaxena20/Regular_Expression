package assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example3 {
    public static void main(String[] args)throws Exception {
        
        // wap to read all mobile number present in the file where mobile number are mixed with normal text data
        
        Pattern ptr = Pattern.compile("(0|91)?[6-9][0-9]{9}");

        BufferedReader br = new BufferedReader(new FileReader("assignment/input.txt"));
        PrintWriter pw = new PrintWriter("assignment/output.txt");

        String line = br.readLine();

        while (line != null) {
            Matcher mat = ptr.matcher(line);

            while (mat.find()) {
                pw.println(mat.group());
            }
            line = br.readLine();
        }

        pw.flush();

        pw.close();
        br.close();

        // there is one another example in which we have to find all email which are present in text file

    }
}
