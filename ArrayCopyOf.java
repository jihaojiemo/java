import java.util.Arrays;
public class ArrayCopyOf {
    public static void main(String[] args) {
        int[] original = new int[]{1, 2, 3, 4, 5};
        int[] result = Arrays.copyOf(original, 10);
        for(int i : result) {
            System.out.print(i + ",");
        }
    }
}