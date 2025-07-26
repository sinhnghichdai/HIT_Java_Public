import java.util.Scanner;

public class Bai2 {

    public static Scanner sc = new Scanner(System.in);

    public static String daoChuoi(String s) {
        String s2 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s2 += s.charAt(i);
        }
        return s2;
    }

    public static void chuoiDoiXung(String s) {
        if (s.equals(daoChuoi(s))) {
            System.out.println("In hoa chuỗi: " + s.toUpperCase());
            System.out.println("Chuỗi này đối xứng");
        } else {
            System.out.println("In thường chuỗi: " + s.toLowerCase());
            System.out.println("Chuỗi này không đối xứng");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập chuỗi : ");
        String s = sc.nextLine();
        chuoiDoiXung(s);
    }
}
