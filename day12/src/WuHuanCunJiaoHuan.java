/**
 * Description:
 * Author: admin
 * Create: 2019-07-28 17:32
 */
public class WuHuanCunJiaoHuan {
    public int[] exchangeAB(int[] AB) {
        // write code here
        AB[0] = AB[0]^AB[1];
        AB[1] = AB[0]^AB[1];
        AB[0] = AB[0]^AB[1];
        return AB;
    }
}

