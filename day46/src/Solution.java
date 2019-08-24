/**
 * Description:
 * Author: admin
 * Create: 2019-08-24 12:38
 */
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int n = array.length;
        if(n == 0) {
            return 0;
        }
        int num = array[0];
        int count = 1;
        for(int i = 1; i < n; i++) {
            if(array[i] == num) {
                count++;
            }else {
                count--;
            }
            if(count == 0) {
                num = array[i];
                count = 1;
            }
        }
        //经过上面的操作已经找到num了
        //下面的操作时为了确认num出现次数超过了数组长度的一半
        count = 0;
        for(int i = 0; i < n; i++) {
            if(array[i] == num) {
                count++;
            }
        }
        if(count > n/2) {
            return num;
        }else {
            return 0;
        }
    }
}
