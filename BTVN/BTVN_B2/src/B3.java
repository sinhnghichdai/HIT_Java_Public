import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước ma trận : ");
        int n = sc.nextInt();
        int[][] maTran= new int[n][n];
        int value = 1;
        int top = 0, bottom = n-1;
        int left = 0, right = n-1;
        while (value <= n*n){
            for (int i = left; i <= right; i++) {
                maTran[top][i] = value++;
            }
            top++;
            for (int i = right; i>=left; i++){
                maTran[bottom][i] = value++;
            }
            bottom--;
            for (int i = 0; i<n; i++){
                for (int j = 0; j<n; j++) {
                    System.out.printf("%3d", maTran[i][j]);
                }
                System.out.println();
            }
        }
    }
}
