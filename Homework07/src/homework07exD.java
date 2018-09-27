import java.util.*;

public class homework07exD {
    public static int recursion(int n) {
        if (n == 1) {
            return 1;
        }
        if (n % 2 == 1) {
            return 0;
        }
        return recursion(n / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (recursion(n) == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

