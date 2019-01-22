public class Test3 {
    public static void main(String[] args) {
        int a = 1, b = 1, c = 0;
        System.out.print(a+"\t"+b+"\t");
        for(int i = 1; i <= 20; i++) {
            c = a+b;
            a = b;
            b = c;
            System.out.print(c+"\t");
            if((i+2)%5 == 0) {
                System.out.println();
            }
        }
    }
}