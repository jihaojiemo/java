import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Description: nowcoder有两盒（A、B）乒乓球，有红双喜的、有亚力亚的……现在他需要判别A盒是否包含了B盒中所有的种类，
 *              并且每种球的数量不少于B盒中的数量，该怎么办呢？
 * Author: admin
 * Create: 2019-08-26 12:03
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String boxA = sc.next();
            String boxB = sc.next();
            //key为球的种类，value为球的数量
            Map<String, Integer> mapA = new HashMap<>();
            Map<String, Integer> mapB = new HashMap<>();
            for(int i = 0; i < boxA.length(); i++) {
                if(!mapA.containsKey(boxA.charAt(i) + "")) {
                    mapA.put(boxA.charAt(i) + "", 1);
                }else {
                    mapA.put(boxA.charAt(i) + "", mapA.get(boxA.charAt(i) + "")+1);
                }
            }
            for(int i = 0; i < boxB.length(); i++) {
                if(!mapB.containsKey(boxB.charAt(i) + "")) {
                    mapB.put(boxB.charAt(i) + "", 1);
                }else {
                    mapB.put(boxB.charAt(i) + "", mapB.get(boxB.charAt(i) + "")+1);
                }
            }
            //遍历boxB，和boxA中的元素进行对比，flag表示是否满足包含关系
            int flag = 0;
            for(String key : mapB.keySet()) {
                if(!mapA.containsKey(key)) {
                    flag = 1;
                    break;
                }else {
                    if(mapA.get(key) < mapB.get(key)) {
                        flag = 1;
                        break;
                    }
                }
            }
            if(flag == 1) {
                System.out.println("No");
            }else {
                System.out.println("Yes");
            }
        }
    }
}
