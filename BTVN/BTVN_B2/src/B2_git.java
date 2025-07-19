import java.util.Scanner;

public class B2_git {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên : ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi : ");
        String age = sc.nextLine();
        System.out.println("Nhập lớp : ");
        String lopHoc = sc.nextLine();
        System.out.println("Nhập GPA : ");
        String gpa = sc.nextLine();
        System.out.println("Tên: "+name+" - Tuổi: "+age+" - Lớp: "+lopHoc+" - GPA: "+gpa);
    }
}
