/**
 * Description:
 * Author: admin
 * Create: 2019-07-28 17:27
 */
import java.util.*;
public class HuiWenJieMa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            int n = sc.nextInt();
            System.out.println(slove(str, n, sc));
        }
    }
    public static String slove(String str, int n, Scanner sc) {
        for(int i = 0; i < n; i++) {//操作数
            int p = sc.nextInt();//起点的索引数
            int len = sc.nextInt();//个数
            String first = str.substring(0, p+len);
            String mid = str.substring(p, p+len);
            String end = str.substring(p+len, str.length());
            StringBuilder sb = new StringBuilder(first);
            StringBuilder res = new StringBuilder(mid);
            sb.append(res.reverse());
            sb.append(end);
            str = sb.toString();
        }
        return str;
    }
}
