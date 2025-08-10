package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Student> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Student s = new Student();
            System.out.println("Nhập thông tin sinh viên " + (i + 1) + ": ");
            s.Input();
            list.add(s);
        }

        int i = 1;
        for (Student student : list) {
            System.out.println();
            System.out.println("Thông tin sinh viên " + i + ": ");
            student.Output();
            i++;
        }
    }
}