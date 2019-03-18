class Father {
    private String name = "zhangjun";
    class Child {
        public String introFather() {
            return name;
        }
    }
}
public class Test1 {
    public static void main(String[] args) {
        //在外部类外部创建内部类对象
        Father.Child child = new Father().new Child();
        System.out.println(child.introFather());
    }
}