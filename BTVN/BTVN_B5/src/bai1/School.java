package bai1;

public class School {

    private String Name;
    private String Date;

    public School(){}

    public School(String date, String name) {
        Date = date;
        Name = name;
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
}
