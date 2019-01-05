public class ArraySort {
    public static void main(String[] args) {
        int[] intData = new int[]{87, 46, 35, 57, 25, 1, 90};
        char[] charData = new char[]{'z', 'A', 'b', 'E', 'd'};
        java.util.Arrays.sort(intData);
        java.util.Arrays.sort(charData);
        printArray(intData);
        printArray(charData);
    }
    public static void printArray(int[] temp) {
        for(int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + ",");
        }
        System.out.println();
    }
    // 方法重载
    public static void printArray(char[] temp) {
        for(char i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + ",");
        }
        System.out.println();
    }
}