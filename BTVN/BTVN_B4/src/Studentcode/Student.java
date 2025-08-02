package Studentcode;

import java.util.Scanner;

public class Student {
    private String name;
    private int birthYear;
    private String address;
    private double tx1;
    private double tx2;
    private double kthp;
    private int soTietNghi;

    public Student() {}

    public Student(String name, int birthYear, String address, double tx1, double tx2, double kthp, int soTietNghi){
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.kthp = kthp;
        this.soTietNghi = soTietNghi;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getTx1() {
        return tx1;
    }

    public void setTx1(double tx1) {
        this.tx1 = tx1;
    }

    public double getTx2() {
        return tx2;
    }

    public void setTx2(double tx2) {
        this.tx2 = tx2;
    }

    public double getKthp() {
        return kthp;
    }

    public void setKthp(double kthp) {
        this.kthp = kthp;
    }

    public int getSoTietNghi() {
        return soTietNghi;
    }

    public void setSoTietNghi(int soTietNghi) {
        this.soTietNghi = soTietNghi;
    }

    public int getAge() {
        return 2025 - birthYear;
    }

    public double GPA() {
        return tx1 * 0.2 + tx2 * 0.3 + kthp * 0.5;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào tên của sinh viên: ");
        this.name = sc.nextLine();
        System.out.print("Nhập vào năm sinh: ");
        this.birthYear = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập vào địa chỉ: ");
        this.address = sc.nextLine();
        System.out.print("Nhập vào điểm TX1: ");
        this.tx1; = sc.nextFloat();
        System.out.print("Nhập vào điểm TX2: ");
        this.tx2 = sc.nextFloat();
        System.out.print("Nhập vào điểm KTHP: ");
        this.kthp = sc.nextFloat();
        System.out.print("Nhập vào số tiết nghỉ: ");
        this.soTietNghi = sc.nextInt();
        sc.nextLine();
    }

    public void in() {
        System.out.printf("%-15s %-7s %-15s %-10s %-10s %-10s %-10s %-15s%n\n",name, birthYear, address, tx1, tx2, kthp, GPA(), soTietNghi);
    }
}
