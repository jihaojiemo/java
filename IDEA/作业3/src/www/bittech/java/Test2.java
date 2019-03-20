package www.bittech.java;

//利用接口做参数，写个计算器，能完成加减乘除运算。 
//（1）定义一个接口Compute含有一个方法int computer(int n, int m)。 
//（2）设计四个类分别实现此接口，完成加减乘除运算。 
//（3）设计一个类UseCompute，类中含有方法：public void useCom(Compute com, int one, int two)
// 此方法能够用传递过来的对象调用computer方法完成运算，并输出运算的结果。 
//（4）设计一个主类Test，调用UseCompute中的方法useCom来完成加减乘除运算。
interface ICompute {
    int compute(int n,int m);
}
class UseCompute{
    private int n;
    private int m;
    public void UseCom(ICompute com, int one, int two){
        this.n = one;
        this.m = two;
        com.compute(n, m);
    }
}
class Add implements ICompute {
    private int n;
    private int m;
    public int compute(int n, int m){
        this.n = n;
        this.m = m;
        System.out.println("n+m is "+(n+m));
        return n+m;
    }
}
class Minus implements ICompute {
    private int n;
    private int m;
    public int compute(int n, int m){
        this.n = n;
        this.m = m;
        System.out.println("n-m is "+(n-m));
        return n-m;
    }
}
class Mul implements ICompute {
    private int n;
    private int m;
    public int compute(int n, int m){
        this.n = n;
        this.m = m;
        System.out.println("n*m is "+(n*m));
        return n*m;
    }
}
class Div implements ICompute {
    private int n;
    private int m;
    public int compute(int n, int m){
        this.n = n;
        this.m = m;
        System.out.println("n/m is "+(n/m));
        return n/m;
    }
}

public class Test2 {
    public static void main(String []args){
        UseCompute computer = new UseCompute();
        computer.UseCom(new Add(), 8, 2);
        computer.UseCom(new Minus(), 8, 2);
        computer.UseCom(new Mul(), 8, 2);
        computer.UseCom(new Div(), 8, 2);
    }
}