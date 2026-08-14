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

    public final List<Student> arrayNamesAndAges = new ArrayList<>();

    public void storeAndCreateStudents() {

        System.out.print("Enter a Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter the student's age: ");
        byte studentAge = scanner.nextByte();

        arrayNamesAndAges.add(new Student(studentName, studentAge));

        System.out.println("Student add to the List");

        scanner.nextLine();
    }

    // -> Here print those names after accesses the list <- //
    public void listNames() {
        if (arrayNamesAndAges.isEmpty()) {
            return;
        }

        int counter = 0;

        System.out.println("Here is all Students:");
        for (Student namesAndAges : arrayNamesAndAges) {

            if (namesAndAges == null) {
                break;
            }

            System.out.printf("%d - Student Name: %s | Student Age: %d \n", counter, namesAndAges.getName(), namesAndAges.getAge());
            ++counter;
        }
    }
}