class Person {
    public void print() {
        System.out.println("1.我是人类！");
    }
}
class Student extends Person {
    public void print() {
        System.out.println("2.我是学生！");
    }
}
class Worker extends Person {
    public void print() {
        System.out.println("3.我是工人！");
    }
}
public class CanShuTongYiHua {
    public static void main(String[] args) {
        // Person per = new Student();
        WhoYouAre(new Student());
        // Person per = new Worker();
        WhoYouAre(new Worker());
    }
    public static void WhoYouAre(Person per) {
        per.print();
    } 
}