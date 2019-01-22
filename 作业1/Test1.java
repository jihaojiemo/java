class Test {
    public int a = 10;
    char b = 'A';
    public void getInfo() {
        System.out.println("a = "+a+", b = "+b);
    }
}
public class Test1 {
    public static void main(String[] args) {
        Test t = new Test();
        t.getInfo();
    }
}