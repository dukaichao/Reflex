package BIT.Reflex.reflect.getFiled;

import java.util.Date;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-22
 * Time:18:15
 */
public class Son extends Father {

    public double salary;
    public Date d;
    private int id;
    public Son(){}
    public Son(String name,int age,double salary,int id){
        super(name,age);
        this.salary = salary;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Son{" +
                "name='" + name +" id = " + id+
                '}';
    }
}
