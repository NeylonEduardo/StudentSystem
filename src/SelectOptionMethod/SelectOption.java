package SelectOptionMethod;

import OptionsMethod.OptionOneMethod.OptionOne;
import OptionsMethod.OptionsZeroMethod.OptionZero;

import java.util.InputMismatchException;
import java.util.Scanner;

// -> Class to create the menu, and the logic to select the method <- //

public class SelectOption {
    private final Scanner scanner = new Scanner(System.in);

    private final OptionZero optionZero;
    private final OptionOne optionOne;

    public SelectOption(OptionZero optionZero, OptionOne optionOne) {
        this.optionZero = optionZero;
        this.optionOne = optionOne;
    }


    public void selectOption() {
        int valueOption = 0;

        while (valueOption != 2) {
            System.out.println("""
                    --------------------------
                    -----Selection Option-----
                    [0] Add a Student | [1] List All Students | [2] Exit
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

                    System.out.println("\nPress 1 and Enter to go back: ");
                    int numberToGoBack = scanner.nextInt();
                    scanner.nextLine();

                    if (numberToGoBack == 1) {
                        break;
                    }

                case 2:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option, try other!");
                    break;
            }
        }
    }
}
