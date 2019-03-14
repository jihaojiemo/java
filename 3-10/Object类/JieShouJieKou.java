interface IMessage {
    void getMessage();
}
class MessageImpl implements IMessage {
    public void getMessage() {
        System.out.println("Hello world");
    }
    public String toString() {
        return "你好";
    }
}
public class JieShouJieKou {
    public static void main(String[] args) {
        //MessageImpl向上转型
        IMessage m = new MessageImpl();
        //接口向Object转型
        Object obj = m;
        System.out.println(m);
        //向下转型
        IMessage msg = (IMessage) obj;
        msg.getMessage();
    }
}