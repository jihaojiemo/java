class Person {
    private String name;
    private int age;
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
class Student extends Person {
    // 扩充新的属性
    private String school;
    
    // 扩充新的方法
    public void setSchool(String school) {
        this.school = school;
    }
    public String getSchool() {
        return school;
    }
}
public class JiCheng2 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("张三");
        stu.setAge(20);
        stu.setSchool("清华大学");
        System.out.println("姓名是："+stu.getName()+", 年龄是："+stu.getAge()+", 学校是："+stu.getSchool());
    }
}