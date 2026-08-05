package GetAllMethods;

import StudentsMethod.CreateStudentsClass.CreateStudentsClass;

// -> This class is responsible to call all of these methods <- //

public class GetAllMethods {

    public void createStudent(CreateStudentsClass newStudent) {
        newStudent.storeStudentsNames();
    }

    public void listAllNames(CreateStudentsClass newStudent) {
        newStudent.listNames();
    }
}