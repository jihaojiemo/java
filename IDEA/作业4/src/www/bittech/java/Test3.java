package www.bittech.java;

public class Test3 {
    public static void main(String[] args) {
        Integer a = 55;
        Integer b = 55;
        System.out.println(a==b);//true
        System.out.println(a==new Integer(55));//false
        System.out.println(a.equals(new Integer(55)));//true
        Integer c = 129;
        Integer d = 129;
        System.out.println(c==d);//false
    }
}
