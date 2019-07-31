package com.github.jihaojiemo;

/**
 * Description:
 * Author: admin
 * Create: 2019-07-28 17:06
 */
import java.util.*;
public class ZiFuChuanZhongLianXuZuiChangDeShuZiChuan {
    public static void mian(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int max = 0; //数字长度的最大值
        int count = 0; //数字的个数
        int end = 0;//表示数字尾部
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                count++;
                if(max < count) {
                    max = count;
                    end = i;
                }else {
                    //遇到不是数字的时候把计数器置为0
                    count = 0;
                }
            }
            System.out.println(str.substring(end-max+1, end+1));
        }
    }
}

