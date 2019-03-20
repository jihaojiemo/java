package www.bittech.java;

//一个数如果恰好等于它的因子之和，这个数就称为"完数"。
//例如6=1＋2＋3.编程 找出1000以内的所有完数。
public class Test5 {
    public static void main(String[] args) {
        for(int i = 0; i <= 1000; i++) {
            if(isPerfectNum(i)) {
                System.out.println(i+" ");
            }
        }
    }

    public static boolean isPerfectNum(int num) {
        int sum = 0;
        //不算它本身
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            return true;
        }
        return false;
    }
}