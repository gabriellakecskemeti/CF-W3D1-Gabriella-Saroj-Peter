package Gabriella.A3;
import java.util.ArrayList;


public class StudentMain {
    public static void main(String[] args) {

        //Create Student objects
        ArrayList<Student> allStudents= new ArrayList<>();

        allStudents.add(new Student("Eva", "Belle", 2002, "4A"));
        allStudents.add(new Student("Beatrix", "Süss", 2003, "3A"));
        allStudents.add(new Student("Florian", "Sauer", 2003, "3A"));
        allStudents.add(new Student("Stefan", "Bitter", 2004, "2B"));
        allStudents.add(new Student("Michaela", "Salz", 2002, "4A"));


        System.out.println("***********Print out one Employee****");
        allStudents.get(0).printOutStudent();

        allStudents.get(0).setSurName("Schnellbell");
        allStudents.get(0).printOutStudent();

        System.out.println("\n***********Print out all Employee****");

        for (Student element:allStudents) {
            element.printOutStudent();
        }



    }


}
