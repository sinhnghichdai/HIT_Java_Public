package bai1;

import java.util.Scanner;

public class Faculty {
    private String Name;
    private String Date;
    private School x ;

    public void Input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên trường: ");
        String nameSchool = sc.nextLine();

        System.out.print("Nhập ngày vào trường: ");
        String dateSchool = sc.nextLine();

        x.setName(nameSchool);
        x.setDate(dateSchool);

        System.out.print("Nhập tên khoa: ");
        this.Name = sc.nextLine();

        System.out.print("Nhập ngày vào khoa: ");
        this.Date = sc.nextLine();
    }

    public void Output() {
        System.out.println("Trường: " + x.getName());
        System.out.println("Khoa: " + this.Name);
    }


    public Faculty(){}

    public Faculty(String name, String date, School x) {
        Name = name;
        Date = date;
        this.x = x;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public School getX() {
        return x;
    }

    public void setX(School x) {
        this.x = x;
    }
}
