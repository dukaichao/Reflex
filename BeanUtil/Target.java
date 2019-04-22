package BIT.Reflex.reflect.BeanUtil;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-22
 * Time:22:39
 */
public class Target {
    private String name;
    private String address;
    private String email;
    public Target(){}

    public Target(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Target{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
