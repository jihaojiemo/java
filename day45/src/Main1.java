import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Description:
 * Author: admin
 * Create: 2019-08-26 12:07
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int num = sc.nextInt();
            String[] s = new String[num];
            for(int i = 0; i < num; i++) {
                s[i] = sc.next();
            }
            String key = sc.next();//找key的兄弟单词
            char[] keyChar = key.toCharArray();
            Arrays.sort(keyChar);

            int no = sc.nextInt();//找key的第几个兄弟单词
            ArrayList<String> list = new ArrayList<>();

            int count = 0;

            for(int i = 0; i < num; i++) {
                int c = check(key, s[i], keyChar);
                count += c;
                if(c == 1) {
                    list.add(s[i]);
                }
            }
            System.out.println(count);
            Collections.sort(list);
            if(count >= no) {
                System.out.println(list.get(no-1));
            }
        }
    }
    public static int check(String key, String word, char[] keyChar) {
        //keyChar在调用的时候已经排好序了
        //将两个单词按顺序排序后看相不相同就行了
        if(key.equals(word) || key.length() != word.length()) {
            return 0;
        }
        char[] wordChar = word.toCharArray();
        Arrays.sort(wordChar);
        return Arrays.equals(keyChar, wordChar) ? 1 : 0;
    }
}
