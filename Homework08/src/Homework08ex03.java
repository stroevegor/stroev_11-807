import java.util.*;

public class Homework08ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число строк и столбцов :");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = 1;
        int[][] matrix = new int[n][m];
        for (int i = 0; i < m; i++) {
            matrix[0][i] = sc.nextInt();
            s++;}
        for (int j = n - 1; i < n; i++) {
            matrix[i][n - 1] = s++;}
        for (int j = n - 1; j > 0; i--) {
            matrix[i][0] = s++;}
        for (int i = 0; i < ; i++) {

        }

        }

        }
    }
}
