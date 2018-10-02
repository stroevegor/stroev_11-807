import java.util.*;

public class Homework08ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число строк и столбцов :");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int jMin = 0;
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < matrix[i][jMin]) {
                    jMin = j;
                }
            }
            int iMax = 0;
            for (int k = 0; k < n; k++) {
                if (matrix[k][jMin] > matrix[iMax][jMin]) {
                    iMax = k;
                }
            }
            if (iMax == i) {
                System.out.println( matrix[iMax][jMin]);
            }
        }

    }
}
