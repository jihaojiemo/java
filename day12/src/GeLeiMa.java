/**
 * Description:
 * Author: admin
 * Create: 2019-07-28 17:33
 */
public class GeLeiMa {
    public String[] getGray(int n) {
        // write code here
        String[] res = null;
        if(n == 1) {
            res = new String[]{"0", "1"};
        }else {
            String[] str = getGray(n-1);
            res = new String[2*str.length];
            for(int i = 0; i < str.length; i++) {
                res[i] = "0" + str[i];
                res[res.length-1-i] = "1" + str[i];
            }
        }
        return res;
    }
}
