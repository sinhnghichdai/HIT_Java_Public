package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class PhongMay {

    private String maMay;
    private String tenPhong;
    private double dienTich;
    private QuanLy x;
    private Integer n;
    private ArrayList<May> y = new ArrayList<>();


    public PhongMay(){}

    public PhongMay(String maMay, String tenPhong, double dienTich, QuanLy x, Integer n, ArrayList<May> y) {
        this.maMay = maMay;
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
        this.x = x;
        this.n = n;
        this.y = y;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên phòng : ");
        this.maMay = sc.nextLine();

        System.out.print("Nhập mã máy : ");
        this.tenPhong = sc.nextLine();

        System.out.print("Nhập diện tích phòng : ");
        this.dienTich = sc.nextDouble();

        x.Nhap();
        System.out.print("Nhập số lượng máy của phòng : ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            May may = new May("","","");
            System.out.print("Nhập thông tin máy thứ " + (i + 1));
            may.Nhap();
            y.add(may);
        }
    }

    public void Xuat() {
        System.out.println("Thông tin phòng máy : " );
        System.out.println( "Mã máy : " + getMaMay() );
        System.out.println( "Tên phòng : " + getTenPhong() );
        System.out.println( "Diện tích: " + getDienTich() );
        x.Xuat();
        System.out.println("\nThông tin máy trong phòng");
        for(May m : y) {
            m.Xuat();
        }
    }




    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public ArrayList<May> getY() {
        return y;
    }

    public void setY(ArrayList<May> y) {
        this.y = y;
    }
}
