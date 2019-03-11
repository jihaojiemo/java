public class ShuZi {
    public static void main(String[] args) {
        String str = "ab12cd";
        char[] data = str.toCharArray();
        int i;
        for(i = 0; i < data.length; i++) {
            if(data[i] >= '0' && data[i] <= '9') {
                System.out.println("有数字");
                break;
            }
            
        } 
        if(i > data.length) {
            System.out.println("没有数字");
        }  
    }
}