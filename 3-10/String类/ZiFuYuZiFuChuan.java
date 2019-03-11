public class ZiFuYuZiFuChuan {
    public static void main(String[] args) {
        String str = "Hello world";
        char[] data = str.toCharArray();
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i]+"、");
        }
        System.out.println("\n"+new String(data));
        System.out.println(new String(data, 3, 7));
    }
}