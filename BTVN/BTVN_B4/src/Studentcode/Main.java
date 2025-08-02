package Studentcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> danhSach = new ArrayList<>();

        danhSach.add(new Student("A", 2000, "Ha Noi", 8.5, 7.5, 9.0, 2));
        danhSach.add(new Student("B", 2002, "Ha Noi", 10, 9.5, 9.8, 4));
        danhSach.add(new Student("C", 2006, "Ha Noi", 3.5, 6.5, 7.4, 3));
        danhSach.add(new Student("D", 2004, "Ha Noi", 6.5, 8.5, 9.3, 1));
        danhSach.add(new Student("E", 2003, "Ha Noi", 9.5, 5.5, 3.6, 0));

        int choose;
        do {
            System.out.println("==========MENU========");
            System.out.println("1.Thêm sinh viên mới");
            System.out.println("2.Sửa thông tin sinh viên");
            System.out.println("3.Sắp xếp sinh viên theo tuổi");
            System.out.println("4.Sắp xếp sinh viên theo GPA");
            System.out.println("5.Sắp xếp sinh viên theo số tiết nghỉ");
            System.out.println("6.Xóa sinh viên khỏi danh sách");
            System.out.println("0.Thoát");
            System.out.print("CHỌN : ");
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    nhapMang(danhSach);
                    inTieuDe();
                    xuatMang(danhSach);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Nhập tên sinh viên muốn sửa thông tin : ");
                    String ten = sc.nextLine();
                    for (Student sv : danhSach) {
                        if (ten.equalsIgnoreCase(sv.getName())) {
                            System.out.print("Nhập tên mới : ");
                            String name = sc.nextLine();
                            sv.setName(name);
                            System.out.print("Nhập năm sinh mới : ");
                            int nam = sc.nextInt();
                            sv.setBirthYear(nam);
                            sc.nextLine();
                            System.out.print("Nhập địa chỉ mới : ");
                            String dia = sc.nextLine();
                            sv.setAddress(dia);
                            System.out.print("Nhập điểm tx1 mới : ");
                            double tx1 = sc.nextDouble();
                            sv.setTx1(tx1);
                            System.out.print("Nhập điểm tx2 mới : ");
                            double tx2 = sc.nextDouble();
                            sv.setTx2(tx2);
                            System.out.print("Nhập điêm KTHP mới : ");
                            double kthp = sc.nextDouble();
                            sv.setKthp(kthp);
                            System.out.print("Nhập số tiết nghỉ mới : ");
                            int soTietNghi = sc.nextInt();
                            sv.setSoTietNghi(soTietNghi);
                        }
                    }
                    inTieuDe();
                    xuatMang(danhSach);
                    break;
                case 3:
                    danhSach.sort(new Comparator<Student>() {
                        public int compare(Student s1, Student s2) {
                            return Integer.compare(s1.getAge(), s2.getAge());
                        }
                    });
                    inTieuDe();
                    xuatMang(danhSach);
                    break;
                case 4:
                    danhSach.sort(new Comparator<Student>() {
                        public int compare(Student s1, Student s2) {
                            return Double.compare(s1.GPA(), s2.GPA());
                        }
                    });
                    inTieuDe();
                    xuatMang(danhSach);
                    break;
                case 5:
                    danhSach.sort(new Comparator<Student>() {
                        public int compare(Student s1, Student s2) {
                            return Integer.compare(s1.getSoTietNghi(), s2.getSoTietNghi());
                        }
                    });
                    inTieuDe();
                    xuatMang(danhSach);
                    break;
                case 6:
                    sc.nextLine();
                    System.out.println("Nhập tên sinh viên muốn xóa : ");
                    String ten2 = sc.nextLine();
                    for (int i = 0; i < danhSach.size(); i++) {
                        if (ten2.equalsIgnoreCase(danhSach.get(i).getName())) {
                            danhSach.remove(i);
                            i--;
                        }
                    }
                    inTieuDe();
                    xuatMang(danhSach);
                    break;
            }
        } while (choose != 0);
    }

    public static void nhapMang(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so sinh vien : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu " + (i + 1) + ":");
            Student sv = new Student();
            sv.nhap();
            list.add(sv);
        }
    }

    public static void xuatMang(ArrayList<Student> danhSach) {
        for (Student sv : danhSach) {
            sv.in();
        }
    }

    public static void inTieuDe() {
        System.out.printf("%-15s %-7s %-15s %-10s %-10s %-10s %-10s %-15s%n",
                "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "Điểm GPA", "Số tiết nghỉ");
    }
}