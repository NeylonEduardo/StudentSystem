package StudentsMethod.StudentClass;

// -> Create a Student Class to decide what they have <- //

public class Student {
    private String name;
    private byte age;

    public Student(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}