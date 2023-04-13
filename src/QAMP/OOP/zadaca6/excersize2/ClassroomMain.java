package QAMP.OOP.zadaca6.excersize2;

public class ClassroomMain {
    public static void main (String[] args) {
        final Classroom classroom = new Classroom ();

        classroom.addStudent (new Student("Alma Strujic"));
        classroom.addStudent (new Student("Miki Maus", 21));
        classroom.printClassroom();

        System.out.println(classroom.isPresent("Alma Strujic"));
        System.out.println(classroom.isPresent("Paja Patak"));
    }
}
