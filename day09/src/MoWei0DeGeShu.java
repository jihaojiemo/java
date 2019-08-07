/**
 * Description:
 * Author: admin
 * Create: 2019-07-28 17:26
 */
//一个整数等于其质因数之积
import java.util.*;
public class MoWei0DeGeShu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count  = 0;
        for(int i = num; i >= 5; i--) {
            int temp = i;
            while(temp % 5 == 0) {
                count++;
                temp /= 5;
            }
        }
        System.out.println(count);
    }
}
