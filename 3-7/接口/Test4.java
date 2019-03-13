interface A {
    void printA();
}
interface B {
    void printB();
}
interface C extends A, B {
    void printC();
}
class Impl implements C {
    public void printA() {

    }
    public void printB() {

    }
    public void printC() {

    }
}
public class Test4 {
    public static void main(String[] args) {
        
    }
}