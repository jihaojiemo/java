/**
 * Description:
 * Author: admin
 * Create: 2019-07-28 17:31
 */
import java.util.*;
public class GeWeiShuTongJi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int[] a = new int[10];
        for(int i =0 ; i < n.length(); i++) {
            a[n.charAt(i) - '0']++;
        }
        for (int i = 0; i < 10; i++){
            if (a[i] != 0)
                System.out.println(i + ":" + a[i]);
        }
    }
}
