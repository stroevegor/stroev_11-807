import java.util.*;

//Вариант 1
public class ClassTestTask01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n * n;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nTask1: ");
        int arr[] = getSideDiagonalAsVector(matrix);
    }

        static int[] getSideDiagonalAsVector ( int[][] matrix){
            int[] arr = new int[matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                arr[i] = matrix[i][matrix.length - i - 1];
                System.out.println(arr[i] + " ");
            }
            return arr;
        }

    }







