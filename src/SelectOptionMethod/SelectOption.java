package SelectOptionMethod;

import OptionsMethod.OptionOneMethod.OptionOne;
import OptionsMethod.OptionTwoMethod.RemoveStudent;
import OptionsMethod.OptionsZeroMethod.OptionZero;

import java.util.InputMismatchException;
import java.util.Scanner;

// -> Class to create the menu, and the logic to select the method <- //

public class SelectOption {
    private final Scanner scanner = new Scanner(System.in);

    private final OptionZero optionZero;
    private final OptionOne optionOne;
    private final RemoveStudent removeStudent;

    public SelectOption(OptionZero optionZero, OptionOne optionOne, RemoveStudent removeStudent) {
        this.optionZero = optionZero;
        this.optionOne = optionOne;
        this.removeStudent = removeStudent;
    }


    public void selectOption() {
        int valueOption = 0;

        while (valueOption != 3) {
            System.out.println("""
                    --------------------------
                    -----Selection Option-----
                    [0] Add a Student | [1] List All Students | [2] Remove Student | [3] Exit
                    """);

            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.print("Select your Option: ");
                    valueOption = scanner.nextInt();
                    scanner.nextLine();
                    validInput = true;

                } catch (InputMismatchException e) {
                    System.out.println("Invalid option, try other");
                    scanner.next();
                }
            }

            switch (valueOption) {
                case 0:
                    optionZero.execute();
                    break;

                case 1:
                    optionOne.execute();
                    break;

                case 2:
                    removeStudent.execute();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option, try other!");
                    break;
            }
        }
    }
}
