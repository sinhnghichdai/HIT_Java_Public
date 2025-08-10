package bai1;

import java.util.Scanner;

public class Student {
    private String Name;
    private String Classroom;
    private double Score;
    private Faculty y ;

    public Student(){}

    public Student(String name, String classroom, double score, Faculty y) {
        Name = name;
        Classroom = classroom;
        Score = score;
        this.y = y;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên sinh viên: ");
        this.Name = sc.nextLine();

        System.out.println("Nhập lớp: ");
        this.Classroom = sc.nextLine();

        System.out.println("Nhập điểm: ");
        this.Score = sc.nextDouble();
        sc.nextLine();

        y.Input();
    }

    public void Output() {
        y.Output();
        System.out.println("Tên: " + getName());
        System.out.println("Lớp: " + getClassroom());
        System.out.println("Điểm: " + getScore());
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Faculty getY() {
        return y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    public String getClassroom() {
        return Classroom;
    }

    public void setClassroom(String classroom) {
        Classroom = classroom;
    }
}