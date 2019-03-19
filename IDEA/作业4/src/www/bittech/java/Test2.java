package www.bittech.java;

//1).Person类有name,age,salary属性，要求实现至少两个构造方法，并且属性私有，提供对应的getter、setter。
//2).覆写toString方法，要求在System.out.println()函数中传递Person对象能打印出三个属性值而不是对象地址。
//3).覆写equals方法，要求两个Person类对象的值相同时返回true。
class Person {
    private String name;
    private Integer age;
    private Double salary;
    public Person() {}
    public Person(String name, Integer age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "姓名是："+this.name+"，年龄是："+this.age+"，工资是："+this.salary;
    }

    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof Person)) {
            return false;
        }
        Person per = (Person) obj;
        return this.name.equals(per.name)
                && this.age == per.age
                && this.salary == per.salary;
    }
}

public class Test2 {
    public static void main(String[] args) {
        fun(new Person("李四", 25, 8000.0));
        System.out.println(new Person("王五", 30, 10000.0)
                .equals(new Person("王五", 30, 10000.0)));
    }
    public static void fun(Object obj) {
        System.out.println(obj);
    }
}
