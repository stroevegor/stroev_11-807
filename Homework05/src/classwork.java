import java.util.Scanner;


public class classwork {
    public static void main(String[] args) {
        Scanner sc = new Scanner)System.in);
        int n = 0;
        int[] arr = new int [n];
        System.out.println("Number");
        n = sc.nextInt();
        int n = arr.length;
        for (int i = 0; i <n; i++) {
            int indexofMax = 0;
            for (int j = 0; j <n - i; j++) {
                    if (arr[indexofMax] <  arr[j])  {
                        indexofMax = j;
                    }

            }
            int buf = arr[indexofMax];
            arr[indexofMax] = arr[n - 1 - i];
            arr[n - 1 - i] = buf;

        }



    }
}
