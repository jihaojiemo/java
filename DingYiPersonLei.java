class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // public void setName(String n) {
    //     name = n;
    // }
    // public String getName() {
    //     return name;
    // }

    // public void setAge(int a) {
    //     age = a;
    // }
    // public int getAge() {
    //     if(age < 0) {
    //         return 0;
    //     }else {
    //         return age;
    //     }
    // }

    public void getPersonInfo() {
        System.out.println("姓名是："+name+"，年龄是："+age);
    }
}

public class DingYiPersonLei {
    public static void main(String[] args) {
        Person per1 = new Person("张三", 20);
        // per1.setName("张三");
        // per1.setAge(20);
        per1.getPersonInfo();
    }
}