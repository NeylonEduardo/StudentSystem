package OptionsMethod.OptionsZeroMethod;

import GetAllMethods.GetAllMethods;
import StudentsMethod.CreateStudentsClass.CreateStudentsClass;

import java.util.InputMismatchException;
import java.util.Scanner;

// -> Option to add students, here you specify how many do you want to add <- //

public class OptionZero {
    private final Scanner scanner = new Scanner(System.in);

    private final GetAllMethods getAllMethods;
    private final CreateStudentsClass createStudentsClass;

    public OptionZero(GetAllMethods getAllMethods, CreateStudentsClass createStudentsClass) {
        this.getAllMethods = getAllMethods;
        this.createStudentsClass = createStudentsClass;
    }

    public void execute() {
        int numberOfStudent = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.print("How many students do you want do add: ");
                numberOfStudent = scanner.nextInt();
                scanner.nextLine();
                isValidInput = true;

            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input, enter a integer number");
                scanner.next();
            }
        }
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.print("Enter a Student Name: ");
            getAllMethods.createStudent(createStudentsClass);
        }
    }
}
