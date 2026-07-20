package OptionsMethod.OptionOneMethod;

import GetAllMethods.GetAllMethods;
import StudentsMethod.CreateStudentsClass.CreateStudentsClass;

// -> Option to list all students <- //

public class OptionOne {
    private final GetAllMethods getAllMethods;

    public OptionOne(GetAllMethods getAllMethods) {
        this.getAllMethods = getAllMethods;
    }

    public void execute(CreateStudentsClass createStudentsClass) {
        System.out.println("Here is all Students: ");
        getAllMethods.listAllNames(createStudentsClass);
    }
}