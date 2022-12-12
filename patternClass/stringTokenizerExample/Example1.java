package patternClass.stringTokenizerExample;

import java.util.StringTokenizer;

public class Example1 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Durga Software Solution");

        // SPACE IS A DEFAULT IS TOKEN FOR STRING TOKENIZER
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
