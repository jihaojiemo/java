package com.github.jihaojiemo;

/**
 * Description:
 * Author: admin
 * Create: 2019-07-28 17:07
 */
import java.util.*;

public class HeFaKuoHao {
    public boolean chkParenthesis(String A, int n) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < n; i++) {
            if(A.charAt(i) == '(') {
                stack.push(A.charAt(i));
            }else if(A.charAt(i) == ')') {
                if(stack.isEmpty()) {
                    return false;
                }else {
                    stack.pop();
                }
            }else {
                return false;
            }
        }
        if(!stack.isEmpty()) {
            return false;
        }else {
            return true;
        }
    }
}
