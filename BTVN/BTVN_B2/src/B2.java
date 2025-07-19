import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử n : ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Nhập phần tử A[i] : ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i += 2) {
            int left = (i - 1 >= 0) ? A[i - 1] : 0;
            int right = (i + 1 < n) ? A[i + 1] : 0;
            A[i] += Math.abs(right - left);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(A[i]);
        }
    }
}