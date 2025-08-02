package entiny;

public class Student {
    private int age;
    private String name;
    private String studentCode;

    public Student(int age, String name, String studentCode){
        this.age = age;
        this.name = name;
        this.studentCode = studentCode;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student(){

    }

    public void speakA (){
        System.out.println("Hello! " + name);
    }

    public void speakB (){
        System.out.println("Hello! B");
    }

   public void speakC (){
        System.out.println("Hello C");
    }

    void speakD (){
        System.out.println("Hello D");
    }

    public String getName(){
        return this.name;
    }
    public void setName (String name){
        this.name = name;
    }


    public int  getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getStudentCode(){
        return this.studentCode;
    }

    public void setStudentCode(){
        this.studentCode = studentCode;
    }

}

