public class BiJiao {
    public static void main(String[] args) {
        Integer num1 = 127;
        Integer num2 = 127;
        System.out.println(num1==num2);
        System.out.println(num1.equals(num2));
        System.out.println("==========");
        Integer num3 = 128;
        Integer num4 = 128;
        System.out.println(num3==num4);
        System.out.println(num3.equals(num4));
    }
}