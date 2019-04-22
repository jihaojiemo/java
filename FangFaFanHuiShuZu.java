public class FangFaFanHuiShuZu {
    public static void main(String[] args) {
        int[] data = init();
        printArray(data);
    }
    // 定义一个返回数组的方法
    public static int[] init() {
        // 匿名数组
        return new int[]{1, 2, 3, 4, 5};
    }
    public static void printArray(int[] temp) {
        for(int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }
}