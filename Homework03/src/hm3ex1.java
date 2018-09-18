package  com.company;
import java.util.Scanner;

        public class hm3ex1 {
            public static void main(String[] args) {
          
                Scanner in = new Scanner(System.in);
                System.out.print("How many students? ");
                
                int n = in.nextInt();
                int[] high = new int [n];
                for (int i = 0; i < n; i++) {
                    high[i] = in.nextInt();

                }
                int Sum = 0;
                for (int i = 0; i < n; i++) {
                    Sum += high[i];
                }
                double medhigh = Sum / n;
                int undermedhigh = 0;
                for (int i = 0; i < n; i++) {
                    if (medhigh  < high[i]) {
                        undermedhigh++;
                }
                }
                System.out.println("Средний рост = " + medhigh + " " + "Студентов с ростом выше среднего = " + undermedhigh);


    }
}
