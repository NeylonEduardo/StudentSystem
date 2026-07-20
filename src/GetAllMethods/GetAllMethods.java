package GetAllMethods;

import StudentsMethod.CreateStudentsClass.CreateStudentsClass;

// -> This class is responsible to call all of these methods <- //

public class GetAllMethods {
    private CreateStudentsClass newStudent;

    public void createStudent(CreateStudentsClass newStudent) {
        this.newStudent = newStudent;
        newStudent.storeStudentsNames();
    }

    public void listAllNames(CreateStudentsClass newStudent) {
        this.newStudent = newStudent;
        newStudent.listNames();
    }
}