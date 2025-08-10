import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập cân nặng : ");
        double canNang = nhap.nextDouble();
        System.out.println("Nhập chiều cao : ");
        double chieuCao = nhap.nextDouble();

        System.out.println("BMI = " + canNang + " / (" + chieuCao + "*" + chieuCao + ") = " + (canNang/(chieuCao*chieuCao)) );
    }
}
