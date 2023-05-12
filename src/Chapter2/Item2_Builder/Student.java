package Chapter2.Item2_Builder;

public class Student {

    private final String studentName;
    private final int age;
    private final String address;


    public static class Builder {
        //Required parameters
        private final String studentName;
        private final int age;

        //Optional parameters - initialized to default value
        private String address = "";

        public Builder(String studentName, int age) {
            this.studentName = studentName;
            this.age = age;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    private Student(Builder builder) {
        studentName = builder.studentName;
        age = builder.age;
        address = builder.address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
