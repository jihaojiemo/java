package com.github.jihaojiemo;

/**
 * Description:
 * Author: admin
 * Create: 2019-07-28 17:04
 */
import java.util.*;

public class ShuZuZhongDeNiXuDui {
    public int count(int[] A, int n) {
        // write code here
        int sum = 0;
        for(int i = 0; i < A.length; i++) {
            for(int j = i+1; j < A.length; j++) {
                if(A[i] > A[j]) {
                    sum += 1;
                }
            }
        }
        return sum;
    }
}
