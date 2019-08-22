/**
 * Description:
 * Author: admin
 * Create: 2019-08-22 21:42
 */
public class MaxGap {
    public int findMaxGap(int[] A, int n) {
        // write code here
        int max = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] > max) {
                max = A[i];
            }
        }
        int ans1 = max - A[0];
        int ans2 = max - A[A.length - 1];
        return ans1 > ans2 ? ans1 : ans2;
    }
}
