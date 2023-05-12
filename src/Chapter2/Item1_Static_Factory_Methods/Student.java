package Chapter2.Item1_Static_Factory_Methods;

public class Student extends Class {

    String studentName;
    int age;
    String address;

    public Student(String studentName, int age, String address) {
        this.studentName = studentName;
        this.age = age;
        this.address = address;
    }

    public Student(String name, int id, String studentName, int age, String address) {
        super(name, id);
        this.studentName = studentName;
        this.age = age;
        this.address = address;
    }

    public Student() {
    }

    public static Student StudentWithName(String studentName){
        return new Student(studentName, 17, "VietNam");
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "class='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", name='" + studentName + '\'' +
                ", id=" + id +
                '}';
    }
}
