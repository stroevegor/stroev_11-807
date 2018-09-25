import  java.util.*;

public class homework06ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] symbols = s.toCharArray();
        char none = '\0';
        boolean t = true;
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == 32) {
                symbols[i] = none;
            }
            s = "" + symbols[i];
            System.out.print(s);
        }
    }
}

