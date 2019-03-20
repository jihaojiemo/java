package www.bittech.java;

interface InterfaceA {//b
    String S = "good ";//good后面还有个空格
    void f();
}

abstract class ClassA {//a
    abstract void g();
}

class ClassB extends ClassA implements InterfaceA {
    void g() {
        System.out.print(S);
    }

    public void f() {
        System.out.print(" "+ S);
    }
}
public class Test1 {
    public static void main(String[] args) {
        ClassA a = new ClassB();
        InterfaceA b = new ClassB();
        a.g();
        b.f();
    }
}
//输出：good  good
//中间两个空格，后边一个空格

