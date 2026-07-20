package StudentsMethod.CreateStudentsClass;

import StudentsMethod.StudentClass.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* -> Create a Student Array to storage all of them,
      print they names after to add one to the list,
      and print they Name in the list.
    */

public class CreateStudentsClass {
    private final Scanner scanner = new Scanner(System.in);

    private int counter = 0;
    private final List<String> arrayNames = new ArrayList<>();

    public void storeStudentsNames() {
        Student newStudent = new Student();

        newStudent.setName(scanner.nextLine());
        arrayNames.add(counter, newStudent.getName());
        counter++;
        System.out.println(newStudent.getName() + " Add to the list");
    }

    // -> Here print those names after accesses the list <- //
    public void listNames() {

        for (String names : arrayNames) {
            if (names == null) {
                break;
            }
            System.out.println("Student Name: " + names);
        }
    }
}