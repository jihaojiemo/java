/**
 * Description:
 * Author: admin
 * Create: 2019-08-24 12:42
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();
        while(sc.hasNext()) {
            String str = sc.next();
            int lineNum = sc.nextInt();
            String[] arr = str.split("\\\\");
            String s = arr[arr.length - 1];
            if(s.length() > 16) {
                s = s.substring(s.length()-16);
            }
            String key = s + " " + lineNum;
            if(!map.containsKey(key)) {
                map.put(key, 1);
            }else {
                map.put(key, map.get(key) + 1);
            }
        }
        int count = 0;
        for(String string : map.keySet()) {
            count++;
            //输出租后8个记录
            if(count > (map.keySet().size() - 8)) {
                System.out.println(string + " " + map.get(string));
            }
        }
    }
}