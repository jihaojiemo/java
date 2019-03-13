interface IMessage {
    void getMessage();
}
abstract class News {
    public abstract void getNews();
}
class MessageImpl extends News implements IMessage {
    public void getMessage() {
        System.out.println("hehe");
    }
    public void getNews() {
        System.out.println("haha");
    }
}
public class Test2 {
    public static void main(String[] args) {
        IMessage m = new MessageImpl();
        m.getMessage();
        News n = (News) m;
        n.getNews();
    }
}