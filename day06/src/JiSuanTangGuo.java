/**
 * Description:
 * Author: admin
 * Create: 2019-07-28 17:18
 */
import java.util.*;
public class JiSuanTangGuo {
    public static void main(String[] args) {
        //判断三元一次方程组是否有解及求解
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int y1 = sc.nextInt();//A-B
            int y2 = sc.nextInt();//B-C
            int y3 = sc.nextInt();//A+B
            int y4 = sc.nextInt();//B+C
            float A = (y1+y3)/2f;
            float B = (y3-y1)/2f;
            float C = (y4-y2)/2f;
            if(A-((y1+y3)/2) != 0 || B-((y3-y1)/2) != 0 || B-((y2+y4)/2) != 0 || C-((y4-y2)/2) != 0) {
                System.out.println("No");
            }else {
                System.out.println((int)A + " " + (int)B + " " + (int)C);
            }
        }
    }
}

