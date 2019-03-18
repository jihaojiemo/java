class A{ 
    public A(){ 
        System.out.println("A"); 
    } 
} 
class Test3 extends A{ 
    public Test3(){ 
        System.out.println("B"); 
    } 
    public static void main(String[] args){ 
        Test3 test=new Test3(); 
    } 
} 
//要产生B类的对象，因为B类继承了A类，根据对象实例化原则应该先调用父类构造方法再调用子类构造方法
//结果是先输出“A”再输出“B”