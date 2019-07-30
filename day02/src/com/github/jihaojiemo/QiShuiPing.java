package com.github.jihaojiemo;

/**
 * Description:
 * Author: admin
 * Create: 2019-07-28 17:03
 */
import java.util.*;
public class QiShuiPing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();//空瓶数
            int total = 0;//饮料数
            while(n > 2) {
                total += n/3;
                n = n/3 + n%3;
            }
            if(n == 2) {
                total += 1;
            }
            System.out.println(total);
        }
    }
}

