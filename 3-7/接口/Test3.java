interface IMessage {
    void getMessage();
}
//抽象类继承了一个接口，可以不实现IMessage中的抽象方法
abstract class News implements IMessage {
    public abstract void getNews();
}
class MessageImpl extends News {
    public void getMessage() {
        System.out.println("hehe");
    }
    public void getNews() {
        System.out.println("haha");
    }
}
public class Test3 {
    public static void main(String[] args) {
        IMessage m = new MessageImpl();
        m.getMessage();
        News n = (News) m;
        n.getNews();
    }
}