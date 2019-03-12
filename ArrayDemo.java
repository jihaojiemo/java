public class ArrayDemo {
    public static void main(String[] args) {
        int[] x = new int[3];
        x[0] = 10;
        x[1] = 20;
        x[2] = 30;
        for(int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        //引用传递
        int[] temp = x;
        //修改数据
        temp[0] = 55;
        System.out.println(x[0]);
    }
}