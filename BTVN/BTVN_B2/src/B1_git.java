import java.util.Scanner;

public class B1_git {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên : ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi : ");
        String age = sc.nextLine();
        System.out.println("Nhập chiều cao : ");
        String tall = sc.nextLine();
        System.out.println("Xin chào "+name+", bạn "+age+" tuổi và cao "+tall+" mét");
    }
}
