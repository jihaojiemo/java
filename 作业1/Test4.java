class Constructor {
    private String name;
    public Constructor() {
        System.out.println("Hello Constructor!");
    }
    public Constructor(String name) {
        this();
        this.name = name;
    }
    public void constructorGetInfo() {
        System.out.println("姓名是："+name);
    }
}

public class Test4 {
    public static void main(String[] args) {
        Constructor con1 = new Constructor();
        con1.constructorGetInfo();
        Constructor con2 = new Constructor("张三");
        con2.constructorGetInfo();
    }
}