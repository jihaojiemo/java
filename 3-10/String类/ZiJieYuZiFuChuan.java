public class ZiJieYuZiFuChuan {
    public static void main(String[] args) {
        String str = "Hello";
        byte[] data = str.getBytes();
        for(int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        System.out.println(new String(data));
        System.out.println(new String(data, 1, 3));
    }
}
    