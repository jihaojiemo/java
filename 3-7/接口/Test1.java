interface IMessage {
    //省略了public，static和final
    String MSG = "hehe";
    //省略了public，abstract
    void print();
}
class MessageImpl implements IMessage {
    //前面什么也不写的是default权限
    void print() {
        System.out.println("hehe");
    }
}