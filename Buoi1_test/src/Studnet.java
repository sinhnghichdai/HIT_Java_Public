import java.util.Scanner;

public class Studnet {

    public static void age(String name, ) {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println(name);

        int age = sc.nextInt();
        System.out.println(age);

        double tall = sc.nextDouble();
        System.out.println(tall);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        double tall;
        age(name,age, tall);
        System.out.println("Xin chào " + name + ", bạn " + age + " tuổi và cao " + tall + " mét.");
    }
}