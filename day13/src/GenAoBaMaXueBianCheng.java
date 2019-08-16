/**
 * Description:
 * Author: admin
 * Create: 2019-07-28 17:34
 */
import java.util.*;
public class GenAoBaMaXueBianCheng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//列数
        String c = sc.next();
        for(int i = 1; i <= N; i++){//输出第一行
            System.out.print(c);
        }
        System.out.println();//第一行换行
        for(int i = 1; i <= Math.ceil((double)N/2)-2; i++){//输出中间行（N-2行）
            System.out.print(c);//中间行第一个字符
            for(int j = 2;j <= N-1; j++){
                System.out.print(" ");//中间行其它字符为空字符串
            }
            System.out.println(c);//中间行最后一个字符
        }
        for(int i = 1; i <= N; i++){//输出最后一行
            System.out.print(c);
        }
    }
}
