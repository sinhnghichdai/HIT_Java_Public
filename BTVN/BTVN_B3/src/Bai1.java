import java.util.Scanner;

public class Bai1 {
    static final String SQUARE = "Square";
    static final String TRIANGLE = "Triangle";
    static final String CIRCLE = "Circle";

    public static Scanner sc = new Scanner(System.in);

    public static double hinhVuong(double canh){
        return canh * canh;
    }

    public static double hinhTG(double cao, double day){
        return cao * day / 2;
    }

    public static double hinhTron(double r){
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        System.out.print("Nhập hình dạng viên gạch (Square/Triangle/Circle): ");
        String nhap = sc.nextLine();

        if (nhap.equalsIgnoreCase(SQUARE)) {
            System.out.print("Nhập độ dài cạnh hình vuông: ");
            double canh = sc.nextDouble();
            System.out.println("Diện tích hình vuông là: " + hinhVuong(canh) + " cm²");
        } else if (nhap.equalsIgnoreCase(TRIANGLE)) {
            System.out.print("Nhập chiều cao của tam giác: ");
            double cao = sc.nextDouble();
            System.out.print("Nhập cạnh đáy của tam giác: ");
            double day = sc.nextDouble();
            System.out.println("Diện tích tam giác là: " + hinhTG(cao, day) + " cm²");
        } else if (nhap.equalsIgnoreCase(CIRCLE)) {
            System.out.print("Nhập bán kính hình tròn: ");
            double r = sc.nextDouble();
            System.out.println("Diện tích hình tròn là: " + hinhTron(r) + " cm²");
        } else {
            System.out.println("Hình dạng không hợp lệ!");
        }
    }
}
