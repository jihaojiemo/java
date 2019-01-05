public class FangFaJieShouShuZu {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 5};
        printArray(data);
    }
    public static void printArray(int[] temp) {
        for(int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }
}