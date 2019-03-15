import java.util.Scanner;

//基类声明为抽象类的原因是其子类必须实现其操作
abstract class CaffeeineBeverage {
    //模板方法，模拟饮料机的按键，被声明为final是为了防止子类修改
    public final void perpareRecipe() {
        boilWater();
        brewBeverage();
        pourIncup();
        //如果顾客想要饮料我们才调用加料方法
        if(isCustomerWantsConditions()) {
            addCondiments();
        }   
    }

    //烧水和倒入杯中是一样的，具体操作且共用的方法定义在超类中可以被模板方法或子类直接使用
    public void boilWater() {
        System.out.println("将水烧开");
    }
    public void pourIncup() {
        System.out.println("将饮料倒入杯中");
    }
    
    //泡什么饮料以及加什么调料不一样，抽象方法，具体操作延迟到子类中实现
    public abstract void brewBeverage();
    public abstract void addCondiments();
    
    //钩子方法，钩子方法是一类"默认不做事的方法"，子类可以视情况决定要不要覆盖它
    public boolean isCustomerWantsConditions() {
        return true;
    }
}

//咖啡类和茶类现在都是依赖超类来处理冲泡流程，烧水和倒入杯中从父类继承下来了，因此只需要各自处理冲泡和加调料部分即可
class Coffee extends CaffeeineBeverage {
    public void brewBeverage() {
        System.out.println("冲泡咖啡");
    }
    public void addCondiments() {
        System.out.println("加入糖和牛奶");
    }
}
class Tea extends CaffeeineBeverage {
    public void brewBeverage() {
        System.out.println("浸泡茶包");
    }
    public void addCondiments() {
        System.out.println("加入柠檬");
    }
    //钩子方法子类视情况而定是否需要覆写，默认值是true
    public boolean isCustomerWantsConditions() {
        System.out.println("您需要加柠檬吗？ y：需要  n：不需要");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if(str.equals("y")) {
            System.out.println("客户想要柠檬");
            return true;
        } else {
            System.out.println("客户什么都不加");
            return false;
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        System.out.println("给大佬递咖啡");
        coffee.perpareRecipe();
        System.out.println("==========");
        Tea tea = new Tea();
        System.out.println("给大佬递茶");
        tea.perpareRecipe();
    }
}
