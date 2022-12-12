package patternClass.stringTokenizerExample;

import java.util.StringTokenizer;

public class CustomTokenForStringTokenizer {
    public static void main(String[] args) {

        // first args is target & second is pattern
        StringTokenizer st = new StringTokenizer("10-DEC-2022", "-");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
