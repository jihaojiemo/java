// 目标数组: dataA  源数组: dataB 
// 要求替换后是: 1, 22, 33, 4, 5
public class ArrayCopy {
    public static void main(String[] args) {
        int[] dataA = new int[]{1, 2, 3, 4, 5};
        int[] dataB = new int[]{11, 22, 33, 44, 55};
        System.arraycopy(dataB, 1, dataA, 1, 2);
        printArray(dataA);
    }
    public static void printArray(int[] temp) {
        for(int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + ",");
        }
    }
}