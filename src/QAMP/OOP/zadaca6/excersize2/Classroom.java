package QAMP.OOP.zadaca6.excersize2;

import java.util.ArrayList;

public class Classroom {
    private ArrayList<Student> listOfStudents;

    public Classroom() {
        this.listOfStudents = new ArrayList();
    }

    public void addStudent (Student student){
        this.listOfStudents.add(student);
    }

    public boolean isPresent (String name) {
        for (final Student student : listOfStudents){
            return student.getName().equals(name);
        }
        return false;
    }

    public void printClassroom(){
        for (Student student : listOfStudents){
            System.out.println(student);
        }
    }
}

