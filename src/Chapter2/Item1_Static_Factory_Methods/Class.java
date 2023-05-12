package Chapter2.Item1_Static_Factory_Methods;

public class Class {
    String name;
    int id;

    public Class() {
    }

    public Class(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static Class GetDefaultClass(int id, String name, Student student){
        return new Student(name, id, student.studentName, student.age, student.address);
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
