package fibonacciSequence;

public class Fibo {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
    public static long fibo(long n) {
        if(n < 0) {
            throw new IllegalArgumentException("fibo n must be more than 0");
        }
        if(n == 1 || n == 2) {
            return 1;
        } else {
            return fibo(n-1) + fibo(n-2);
        }
    }
}
