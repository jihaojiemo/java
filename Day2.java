public class Day2 {
    public static void main(String[] args) {
     int[][] data = new int[][]{{1, 3, 5}, {2, 4, 6, 8, 10}, {7, 9}};
     for(int x = 0; x < data.length; x++) {
         for(int y = 0; y < data[x].length; y++) {
             System.out.print(data[x][y] + ",");
         }
     }
     }
}
