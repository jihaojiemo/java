package com.github.jihaojiemo;

/**
 * Description:
 * Author: admin
 * Create: 2019-07-28 17:01
 */
import java.util.*;

public class XunZhaoDikDa {
    public int findKth(int[] a, int n, int K) {
        return findKth(a, 0, n-1, K);
    }
    public int findKth(int[] a, int low, int high, int k) {
        int p = partation(a, low, high);
        if(p-low == k-1) {
            return a[p];
        }else if(p-low+1 > k) {//在左边
            return findKth(a, low, p-1, k);
        }else {
            //如果p-low+1<k，则第k大的元素在后半段，此时更新low=p+1,且k= k - (p - low + 1)
            return findKth(a, p+1, high, k-p+low-1);
        }
    }
    public int partation(int[] a, int low, int high) {
        int temp = a[low];
        while(low < high) {
            while(low < high && a[high] < temp) {
                high--;
            }
            a[low] = a[high];
            while(low < high && a[low] > temp) {
                low++;
            }
            a[high] = a[low];
        }
        a[low] = temp;
        return low;
    }
}
