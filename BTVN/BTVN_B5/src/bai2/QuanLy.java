package bai2;

import java.util.Scanner;

public class QuanLy {
    private String maQL;
    private String hoTen;

    public QuanLy(){}

    public QuanLy(String maQL, String hoTen) {
        this.maQL = maQL;
        this.hoTen = hoTen;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã quản lý: ");
        this.maQL = sc.nextLine();
        System.out.print("Nhập tên quản lý: ");
        this.hoTen = sc.nextLine();
    }

    public void Xuat() {
        System.out.println("Mã quản lý: " + getMaQL() );
        System.out.println("Tên quản lí: " + getHoTen() );
    }




    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
}
