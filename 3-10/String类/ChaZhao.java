public class ChaZhao {
    public static void main(String[] args) {
        String str = "$$helloworld!!";
        System.out.println(str.contains("hello"));
        System.out.println(str.indexOf("o"));
        //indexOf如果没有返回-1
        System.out.println(str.indexOf("o", 7));
        System.out.println(str.lastIndexOf("e"));
        System.out.println(str.lastIndexOf("e", 10));
        System.out.println(str.startsWith("$$"));
        System.out.println(str.startsWith("h", 2));
        System.out.println(str.endsWith("!!"));
    }
}