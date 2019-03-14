class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //若要输出内容就要覆写Object类的toString方法
    public String toString() {
        return "姓名是："+this.name+"年龄是："+this.age;
    }
}
public class HuoQuDuiXiangXinXi {
    public static void main(String[] args) {
        fun("Hello"+new Person("张三", 20));
    }
    public static void fun(Object obj) {
        System.out.println(obj.toString());
    }
}