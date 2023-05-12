package Chapter2.Item2_Builder;

public class Main {
    public static void main(String[] args) {
        Student student = new Student.Builder("tue", 20).address("vietnam").build();
        System.out.println(student);
    }
}
