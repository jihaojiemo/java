public class ArrayUtils{

    //1.计算数组中最大值
    public static int arrayMaxElement(int[] data){
        // 哨兵思想
        int max = data[0];
        for(int i = 0; i<data.length; i++) {
            if(data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }
    
    //2.计算数组中最小值
    public static int arrayMinElement(int[] data){
        int min = data[0];
        for(int i = 0; i<data.length; i++) {
            if(data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }
    
    //3.计算数组值之和
    public static int arrayElementSum(int[] data){
        int result = 0;
        for(int temp : data) {
            result += temp;
        }
        return result;
    }
    
    //4.数组拼接
    // [1,3,5,7,9] [2,4,6,8,10] => [1,3,5,7,9,2,4,6,8,10]
    public static int[] arrayJoin(int[] a, int[] b){
        int length = a.length + b.length;
        int[] result = new int[length];
        for(int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        int flag = a.length;
        for(int i = 0; i < b.length; i++) {
            result[flag] = b[i];
            flag++;
        }
        return result;
    }

    //5.数组截取
    //{1,3,5,7,9,11,13,15,17} [1,6) => {3,5,7,9,11}
    //[start, end)
    public static int[] arraySub(int[] data, int start , int end){
        int length = end - start;
        int[] result = new int[length];
        int flag = start;
        for(int i = 0; i < length; i++) {
            result[i] = data[flag];
            flag++;
        }
        return result;
    }
    
    //6.数组打印
    public static void printArray(int[] data){
        for(int temp : data) {
            System.out.print(temp + "、");
        }
        System.out.println();
    }
    
    //7.数组反转
    //比如：[1,2,3,4] => [4,3,2,1]
    public static void printReversal(int[] data){
        for(int i = data.length-1; i >= 0; i--) {
            System.out.print(data[i] + "、");
        }
    }
    
    public static void main(String[] args){
        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] a = new int[]{1, 3, 5, 7, 9};
        int[] b = new int[]{2, 4, 6, 8, 10};
        System.out.println(arrayMaxElement(data));
        System.out.println(arrayMinElement(data)); 
        System.out.println(arrayElementSum(data));   
        printArray(arrayJoin(a, b));
        printArray(arraySub(data, 1, 6));
        printArray(data);
        printReversal(data);
    }
}
