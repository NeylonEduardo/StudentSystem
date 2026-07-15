import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    static void main() {
        SelectOption selectOption = new SelectOption();
        selectOption.selectOption();
    }
}

class Student {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class CreateStudents {
    Scanner scanner = new Scanner(System.in);

    protected int counter = 0;
    String[] arrayNames = new String[99];

    protected void storeStudentsNames() {
        Student newStudent = new Student();

        newStudent.setName(scanner.nextLine());
        arrayNames[counter] = newStudent.getName();
        counter++;
        System.out.println(newStudent.getName() + " Add to the list");
    }

    protected void listNames() {

        for (String names : arrayNames) {
            if (names == null) {
                break;
            }
            System.out.println("Student Name: " + names);
        }
    }
}


class GetAllMethods {
    CreateStudents newStudent = new CreateStudents();

    protected void createStudent() {
        newStudent.storeStudentsNames();
    }

    protected void listAllNames() {
        newStudent.listNames();
    }
}

class SelectOption {

    Scanner scanner = new Scanner(System.in);
    GetAllMethods getAllMethods = new GetAllMethods();
    OptionZero optionZero = new OptionZero(this.getAllMethods);
    OptionOne optionOne = new OptionOne(this.getAllMethods);

    protected void selectOption() {
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

class OptionZero {
    private final Scanner scanner = new Scanner(System.in);
    private final GetAllMethods getAllMethods;

    public OptionZero(GetAllMethods getAllMethods) {
        this.getAllMethods = getAllMethods;
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
            getAllMethods.createStudent();
        }
    }
}

class OptionOne {
    private final GetAllMethods getAllMethods;

    public OptionOne(GetAllMethods getAllMethods) {
        this.getAllMethods = getAllMethods;
    }

    public void execute() {
        System.out.println("Here is all Students: ");
        getAllMethods.listAllNames();
    }
}