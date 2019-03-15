interface ISubject {
    //核心业务是买电脑
    void buyComputer();
}

//真实业务, 相当于实际上要付款的客户
class RealSubject implements ISubject {
    public void buyComputer() {
        System.out.println("2.买一台mac电脑，付款");
    }
}

//辅助真实业务的实现, 相当于代购
class ProxySubject implements ISubject {
    //传入的是接口对象：只要是接口中定义的业务，代理类都可以进行代理
    //(只要是买电脑，代购都可以处理，若传入真实类，则只能代购具体品牌电脑)
    private ISubject subject;
    //需要传入真实业务对象，代理类需要知道真实对象是谁，完成真实业务是由真实对象来完成，代理类只需要辅助之
    //(掏钱的是客户而不是代购)通过构造方法传入(下订单时，商家已经知道客户是谁)
    public ProxySubject(ISubject subject) {
        this.subject = subject;
    } 
    
    public void beforeBuyComputer() {
        System.out.println("1.到美国苹果店排队");
    }
    public void afterBuyComputer() {
        System.out.println("3.将电脑快递回客户手中");
    }
    
    //业务流程
    public void buyComputer() {
        this.beforeBuyComputer();
        this.subject.buyComputer();
        this.afterBuyComputer();
    }
}
public class Test {
    public static void main(String[] args) {
        ISubject subject = new ProxySubject(new RealSubject());
        subject.buyComputer();
    }
}

