public class JieShouShuZu {
    public static void main(String[] args) {
        //向上转型，Object类接收了一个数组
        Object obj = new int[]{1, 2, 3, 4, 5};
        //向下转型，强转
        int[] data = (int[]) obj;
        for(int i : data) {
            System.out.print(i + "、");
        }
    }
}