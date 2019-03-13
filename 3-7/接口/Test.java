interface IMessage {
    //全局变量
    public static final String MSG = "hehe";
    //抽象方法
    public abstract void getMessage(); 
}
interface INews {
    //抽象方法
    public abstract void getNews();
}
class MessageImpl implements IMessage, INews {
    public void getMessage() {
        System.out.println(MSG);
    }
    public void getNews() {
        System.out.println("haha");;
    }
}
public class Test {
    public static void main(String[] args) {
        //子类向上转型为父接口实例化对象
        IMessage m = new MessageImpl();
        m.getMessage();
        //同理
        INews n = (INews) m;
        n.getNews();
    }
}