package BIT.Reflex.reflect.getMethod;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-21
 * Time:23:58
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
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
