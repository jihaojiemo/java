public class FangFaXiuGaiShuZu {
    public static void main(String[] args) {
        int[] data = init();
        bigger(data);
        printArray(data);
    }
    // 定义一个返回数组的方法
    public static int[] init() {
        return new int[]{1, 2, 3, 4, 5};
    }
    // 把数组每个值扩大5倍
    public static void bigger(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] *= 5;
        }
    }
    public static void printArray(int[] temp) {
        for(int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }
}