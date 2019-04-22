package BIT.Reflex.reflect.getConstructor1;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-21
 * Time:23:33
 */
public class Person {
    private String name;
    private int age;
    private char c;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int age, char c) {
        this.age = age;
        this.c = c;
    }

    public Person(String name, int age, char c) {
        this.name = name;
        this.age = age;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", c=" + c +
                '}';
    }
}
