package AppConfig;

import GetAllMethods.GetAllMethods;
import OptionsMethod.OptionOneMethod.OptionOne;
import OptionsMethod.OptionsZeroMethod.OptionZero;
import SelectOptionMethod.SelectOption;
import StudentsMethod.CreateStudentsClass.CreateStudentsClass;

public class AppConfig {

    private final SelectOption selectOption;

    public AppConfig() {
        GetAllMethods getAllMethods = new GetAllMethods();
        CreateStudentsClass createStudentsClass = new CreateStudentsClass();

        OptionZero optionZero = new OptionZero(getAllMethods, createStudentsClass);
        OptionOne optionOne = new OptionOne(getAllMethods, createStudentsClass);

        this.selectOption = new SelectOption(optionZero, optionOne);
    }

    public SelectOption getSelectOption() {
        return selectOption;
    }
}
