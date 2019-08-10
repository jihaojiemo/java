/**
 * Description:
 * Author: admin
 * Create: 2019-07-28 17:28
 */
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, c = 1;
        while(c < n) {
            a = b;
            b = c;
            c = a + b;
        }
        int disc1 = n - b;
        int disc2 = c - n;
        System.out.println(disc1 < disc2 ? disc1 : disc2);
    }
}

