import java.util.Scanner;


public class homework05ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("write symbols");
        String one = sc.nextLine();
        char[] symblos = one.toCharArray();
        for (int i = 0; i < symblos.length; i++) {
            if ((symblos [i]  >= 48 && symblos[i] <= 57)) {
                symblos[i] = '*';
                System.out.print(symblos[i]);
            } else {
                System.out.print(symblos[i]);

            }

        }
    }
    }

