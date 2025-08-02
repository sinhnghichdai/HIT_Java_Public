package run;

import service.Student;

public class Main {
    public static void main(String[] args) {
        Student S = new Student(19, "Sinh");
        S.sayHello();
        S.setName("Sing");
        S.setAge(20);
//        S.getName("Singg");
//        S.getAge(18)
    }
}
