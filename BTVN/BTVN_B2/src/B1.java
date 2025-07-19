import java.text.DecimalFormat;
import java.util.Scanner;

public class B1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Nhập bán kính r thuộc khoảng 0<r<1000 : ");
        double r = sc.nextDouble();
        if (r < 0 || r > 1000){
            System.out.println("r không hợp lệ");
            return ;
        }
        double chuVi = 2*pi*r;
        double dienTich = pi*r*r;
        DecimalFormat df = new DecimalFormat("#.###");
        String P = df.format(chuVi);
        String S = df.format(dienTich);
        System.out.println("Diện tích là : " + S);
        System.out.println("Chu vi là : " + P);
    }
}
