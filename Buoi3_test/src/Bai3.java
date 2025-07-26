import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một chuỗi : ");
        String nhap = sc.nextLine();
        String trimmedNhap = nhap.trim();
        System.out.println("Chuỗi sau khi xóa khhoảng trắng là : " + trimmedNhap );
        
    }
}
