abstract class A {
    public A() {  //2.实例化A类对象
        this.print();  //3.调用被子类覆写的方法
    }
    public abstract void print();
}
class B extends A {
    private int num = 100;
    public B(int num) {  //1.实例化B类对象
        //super();  //2.隐含一句，实际要先调用A类构造方法
        this.num = num;
    }
    public void print() {  //4.此时子类对象的属性值还没有被初始化，所以是默认值0
        System.out.println(num);
    }
}
public class MeiTuan {
    public static void main(String[] args) {
        new B(30);  //1.程序入口，调用B的构造方法
    }
}