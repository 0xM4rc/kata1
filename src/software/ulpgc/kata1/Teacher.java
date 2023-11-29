package software.ulpgc.kata1;

public class Teacher extends Person{
    private final String employeeID;

    public Teacher(String name, int age, String employeeID) {
        super(name, age);
        this.employeeID = employeeID;
    }

    public void teach(){
        System.out.println(getName()+" está enseñando con el id "+this.employeeID);
    }
}
