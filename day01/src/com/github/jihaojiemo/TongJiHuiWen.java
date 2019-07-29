package com.github.jihaojiemo;

/**
 * Description:
 * Author: admin
 * Create: 2019-07-28 17:00
 */
import java.util.*;

public class TongJiHuiWen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int count = 0;
        for(int i = 0; i <= str1.length(); i++) {
            StringBuilder sb = new StringBuilder(str1);
            sb.insert(i, str2);

            if(isHuiWen(sb.toString())) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isHuiWen(String str) {
        int i = 0;
        int j = str.length()-1;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
