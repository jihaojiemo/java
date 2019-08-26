import java.util.Scanner;

/**
 * Description: 驼峰命名法
 * Author: admin
 * Create: 2019-08-26 22:29
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            String[] strs = str.split("_");
            StringBuffer sb = new StringBuffer(strs[0]);
            for(int i = 1; i < strs.length; i++) {
                sb.append(strs[i].substring(0,1).toUpperCase() + strs[i].substring(1));
            }
            System.out.println(sb.toString());
        }
    }
}
