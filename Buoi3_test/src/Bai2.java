import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){
        final double PI = 3.14159265;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính r : ");
        double r = sc.nextDouble();
        System.out.println("Nhập số mũ k : ");
        int k = sc.nextInt();
        System.out.println("Chu vi hình tròn là : " + (2 * PI * r));
        System.out.println("Diện tích hình tròn là : " + (PI * r * r));
        System.out.println(r+"^"+k +" = "+ Math.pow(r,k));
        System.out.println("|"+r+" - "+k+ "| = " + Math.sqrt(r-k));
    }
}
