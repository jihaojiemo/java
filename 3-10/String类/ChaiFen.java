public class ChaiFen {
    public static void main(String[] args) {
        String str = "192.168.1.1";
        String[] result = str.split("\\.");
        for(String s : result) {
            System.out.println(s);
        }
    }
}