public class Test4 {
    public static void main(String[] args) {
        for(int i = 100; i < 1000; i++) {
            if(isShuiXianHua(i)) {
                System.out.println(i+"、");
            }
        }
    }
    public static boolean isShuiXianHua(int num) {
        if(num < 100 || num > 999) {
            return false;
        } else {
            int geWei = num%10;
            int shiWei = (num/10)%10;
            int baiWei = num/100;
            int total = geWei*geWei*geWei+shiWei*shiWei*shiWei+baiWei*baiWei*baiWei;
            if(total == num) {
                return true;
            } else {
                return false;
            }
        }
    } 
}
