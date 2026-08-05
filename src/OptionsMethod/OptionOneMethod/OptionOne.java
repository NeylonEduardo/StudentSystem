package OptionsMethod.OptionOneMethod;

import GetAllMethods.GetAllMethods;
import StudentsMethod.CreateStudentsClass.CreateStudentsClass;

// -> Option to list all students <- //

public class OptionOne {
    private final CreateStudentsClass createStudentsClass;
    private final GetAllMethods getAllMethods;

    public OptionOne(GetAllMethods getAllMethods, CreateStudentsClass createStudentsClass) {
        this.getAllMethods = getAllMethods;
        this.createStudentsClass = createStudentsClass;
    }

    public void execute() {
        System.out.println("Here is all Students: ");
        getAllMethods.listAllNames(createStudentsClass);
    }
}