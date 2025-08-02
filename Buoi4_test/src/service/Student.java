package service;

public class Student {
    private int age;
    private String name;


    public Student(){

    }

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Xin chào, tôi tên là " + name + ", năm nay " + age + " tuổi");
    }


    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

}