import java.util.Scanner;

public class homework05ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String one = sc.next();
        char [] symbols = one.toCharArray();
        int num = 0;
        for (int i = 0; i < symbols.length; i++) {
            num = num * 10 + symbols[i]-48;

        }
        System.out.print(symbols[num]);

    }
}
