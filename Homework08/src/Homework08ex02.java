import java.util.*;

public class Homework08ex02 {
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
        int columnSumMax = Integer.MIN_VALUE;
        int jMax = 0;
        for (int j = 0; j < m; j++) {
            int columnSum = 0;
            for (int i = 0; i < n; i++) {
                columnSum += matrix[i][j];
            }
            if (columnSum > columnSumMax) {
                columnSumMax = columnSum;
                jMax = j;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][jMax] + " ");
        }
        System.out.println();

        int rowSumMax = Integer.MIN_VALUE;
        int iMax = 0;
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < m; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum > rowSumMax) {
                rowSumMax = rowSum;
                iMax = i;
            }
        }

        for (int j = 0; j < m; j++) {
            System.out.print(matrix[iMax][j] + " ");
        }
    }
}



