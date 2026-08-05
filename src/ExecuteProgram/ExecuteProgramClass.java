package ExecuteProgram;

import AppConfig.AppConfig;
import SelectOptionMethod.SelectOption;

// -> This class will be executed the program <- //

public class ExecuteProgramClass {
    public static void executeProgram() {
        AppConfig appConfig = new AppConfig();

        SelectOption selectOption = appConfig.getSelectOption();
        selectOption.selectOption();
    }
}
