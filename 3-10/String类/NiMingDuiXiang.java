public class NiMingDuiXiang {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        System.out.println("Hello".equals(str1));
        System.out.println(str1.equals("Hello"));
        //还有假设用户没有输入的情况下
        String str2 = null;
        System.out.println("Hello".equals(str2));
        System.out.println(str2.equals("Hello"));
    }
}