package BIT.Reflex.reflect.generalproxy;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-27
 * Time:13:59
 */
public class ProxySubject implements ISubject{
    private ISubject subject;
    public ProxySubject(ISubject subject){
        this.subject = subject;
    }
    public void produceComputer(){
        System.out.println("1.生产");
    }

    public void afterSale(){
        System.out.println("3.售后服务");
    }

    @Override
    public void buyComputer() {
        this.produceComputer();
        this.subject.buyComputer();
        this.afterSale();
    }
}
