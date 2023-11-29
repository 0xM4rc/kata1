package software.ulpgc.kata1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alfredo", 30);
        person.introduceYourself();
        person.haveBirthday();

        Student student = new Student("Rosa", 23, "S7302354723");
        student.study();

        Teacher teacher = new Teacher("Pepe", 50, "T6419246532");
        teacher.teach();//
    }
}
