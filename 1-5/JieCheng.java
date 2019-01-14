public class JieCheng {
    public static void main(String[] args) {
        System.out.print(jieCheng(5));
    }
    public static long jieCheng(int i) {
        if(i == 1) {
            return 1;
        }
        return i * jieCheng(i - 1);
    }
}