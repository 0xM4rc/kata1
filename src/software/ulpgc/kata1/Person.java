package software.ulpgc.kata1;

public class Person {
    private final String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void introduceYourself(){
        System.out.println("Hola, soy "+this.name+ " y tengo "+this.age+" años");
    }

    public void haveBirthday(){
        this.age++;
        System.out.println("Ahora tengo "+this.age+" años");
    }
}
