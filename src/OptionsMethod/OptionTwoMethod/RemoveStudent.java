package OptionsMethod.OptionTwoMethod;

import StudentsMethod.CreateStudentsClass.CreateStudentsClass;
import StudentsMethod.StudentClass.Student;

import java.util.List;
import java.util.Scanner;

public class RemoveStudent {
    private final CreateStudentsClass createStudentsClass;

    public RemoveStudent(CreateStudentsClass createStudentsClass) {
        this.createStudentsClass = createStudentsClass;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = createStudentsClass.arrayNamesAndAges;

        if (studentList.isEmpty()) {
            System.out.println("There are no student in the list!");
            return;
        }
        createStudentsClass.listNames();

        System.out.println("What student do you want to remove: ");
        int removeStudentIndex = scanner.nextInt();

        Student nameRemove = studentList.get(removeStudentIndex);

        studentList.remove(removeStudentIndex);

        System.out.printf("Student %s remove to the list\n", nameRemove.getName());
    }
}
