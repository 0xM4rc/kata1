package software.ulpgc.kata1;

public class Student extends Person{
    private final String studentID;

    public Student(String name, int age, String studentID) {
        super(name, age);
        this.studentID = studentID;
    }

    public void study(){
        System.out.println(getName()+" está estudiando con el id "+this.studentID);
    }
}
