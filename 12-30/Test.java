public class Test {
    public static void main(String[] args) {
        // for(int j = 1; j < 10; ++j) {
        //     for(int i = 1; i <= j; ++i) {
        //         System.out.print("i*j=" + i*j   );
        //     }
        //     System.out.println();
        // }
        System.out.print(factor(20));
    }
    public static int factor(int x) {
        if(x == 1) {
            return 1;
        } else {
            return x*factor(x-1);
        }
    }
}