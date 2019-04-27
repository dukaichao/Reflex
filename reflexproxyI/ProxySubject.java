package BIT.Reflex.reflect.reflexproxyI;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-27
 * Time:14:30
 */
public class ProxySubject implements ISubject{
    private ISubject subject;
    public ProxySubject(ISubject subject){
        this.subject = subject;
    }

    public void eatbefore(){
        System.out.println("想吃卤菜，真香定理再次被证明，去小调买嘛");
    }

    public void eatafter(){
        System.out.println("吃完太辣河口水，压压惊，并且心里发誓，以后再也不买，");
    }

    @Override
    public void eat() {
        this.eatbefore();
        this.subject.eat();
        this.eatafter();
    }
}
