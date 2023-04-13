package QAMP.OOP.zadaca6.excersize2;

public class Student {
    private String name;
    private int age;

    public Student (final String name) {
        this.name = name;
        this.age = 15;
    }

    public Student (final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge (){
        return this.age;
    }
    public String toString () {
return "Student: " + this.name + ", age: " + this.age;
    }
}
