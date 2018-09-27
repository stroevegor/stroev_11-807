import java.util.*;

public class homework07exE {
    public static  int recursion(int n) {
        if (n < 10) {
            return n;
        }
        return recursion(n / 10) + n % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recursion (n));
    }

}
