package AppConfig;

import GetAllMethods.GetAllMethods;
import OptionsMethod.OptionOneMethod.OptionOne;
import OptionsMethod.OptionTwoMethod.RemoveStudent;
import OptionsMethod.OptionsZeroMethod.OptionZero;
import SelectOptionMethod.SelectOption;
import StudentsMethod.CreateStudentsClass.CreateStudentsClass;

public class AppConfig {

    private final SelectOption selectOption;

    public AppConfig() {
        GetAllMethods getAllMethods = new GetAllMethods();
        CreateStudentsClass createStudentsClass = new CreateStudentsClass();

        RemoveStudent removeStudent = new RemoveStudent(createStudentsClass);
        OptionZero optionZero = new OptionZero(getAllMethods, createStudentsClass);
        OptionOne optionOne = new OptionOne(getAllMethods, createStudentsClass);

        this.selectOption = new SelectOption(optionZero, optionOne, removeStudent);
    }

    public SelectOption getSelectOption() {
        return selectOption;
    }
}
