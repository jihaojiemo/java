import java.util.Scanner;

/**
 * Description: 单词倒排
 * Author: admin
 * Create: 2019-08-26 23:06
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            String[] strs = str.split("[^a-zA-Z]");
            for(int i = strs.length - 1; i >= 2; i--) {
                System.out.print(strs[i] + " ");
            }
            if(strs[0].length() == 0) {
                System.out.print(strs[1]);
            }else {
                System.out.println(strs[1] + " " + strs[0]);
            }
        }
    }
}
