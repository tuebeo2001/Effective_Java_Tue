package Chapter2.Item1_Static_Factory_Methods;

public class Main {

    public static void main(String[] args) {

        /** Docs
         * Static factory methods can have meaningful names
         * Static factory methods can return the same type that implements the method(s), a subtype, and also primitives
         * Static factory methods can encapsulate all the logic required for pre-constructing fully initialized instances
         * Static factory methods can be controlled-instanced methods
         */

        Student student_1 = Student.StudentWithName("tue");

        Class class_1 = Class.GetDefaultClass(01, "Class01", student_1);

        Singleton singleton_1 = Singleton.getSingletonInstance(2);
        Singleton singleton_2 = Singleton.getSingletonInstance(3);

        System.out.println(singleton_1.equals(singleton_2));

        System.out.println(class_1);

        System.out.println(student_1);
    }
}
