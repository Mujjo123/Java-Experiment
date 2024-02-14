import java.util.Scanner;

public class SaddlePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix (n):");
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int min = a[i][0];
            int ptr = 0;
            for (int j = 1; j < n; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                    ptr = j;
                }
            }
            int max = a[0][ptr];
            for (int k = 0; k < n; k++) {
                if (a[k][ptr] > max) {
                    max = a[k][ptr];
                }
            }
            if (max == min) {
                System.out.println( max);
            }
        }
    }
}
