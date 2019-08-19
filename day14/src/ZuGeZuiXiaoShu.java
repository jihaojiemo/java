/**
 * Description:
 * Author: admin
 * Create: 2019-07-28 17:36
 */
import java.util.*;
public class ZuGeZuiXiaoShu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        for(int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }
        //输出1-9中最小的数一次
        for(int i = 1; i < 10; i++) {
            if(num[i] != 0) {
                System.out.print(i);
                num[i]--;
                break;
            }
        }
        //把0全部输完
        while(num[0] != 0) {
            System.out.print(0);
            num[0]--;
        }
        //按照1-9顺序输出
        for(int i = 1; i < 10; i++) {
            while(num[i] != 0) {
                System.out.print(i);
                num[i]--;
            }
        }
    }
}
