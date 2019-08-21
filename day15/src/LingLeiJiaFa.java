/**
 * Description:请编写一个函数，将两个数字相加。不得使用+或其他算数运算符。
 * 给定两个int A和B。请返回A＋B的值
 * Author: admin
 * Create: 2019-07-28 17:39
 */
public class LingLeiJiaFa {
    public int addAB(int A, int B) {
        if(B == 0) {
            return A;
        }
        return addAB((A^B), ((A&B)<<1));
    }
}

