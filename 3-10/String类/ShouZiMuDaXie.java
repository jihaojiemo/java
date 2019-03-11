public class ShouZiMuDaXie {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(firstUpperCase(str));
    }
    public static String firstUpperCase(String str) {
        return str.substring(0, 1).toUpperCase()+str.substring(1);
    }
}