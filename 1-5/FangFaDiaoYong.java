public class FangFaDiaoYong {
    public static void main(String[] args) {
        PrintNum(1);
        PrintNum(2);
        PrintNum(3);
        PrintNum(4);
    }
    public static void PrintNum(int x) {
        if(x == 2) {
            return;
        } else {
            System.out.print(x);
        }
    }
}