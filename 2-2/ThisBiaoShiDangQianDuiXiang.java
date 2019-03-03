class Person {
    public void print() {
        System.out.println("print方法"+this);
    }
}
public class ThisBiaoShiDangQianDuiXiang {
    public static void main(String[] args) {
        Person per1 = new Person();
        System.out.println("main方法"+per1);
        per1.print();
        System.out.println("==========");
        Person per2 = new Person();
        System.out.println("main方法"+per2);
        per2.print();
    }
}