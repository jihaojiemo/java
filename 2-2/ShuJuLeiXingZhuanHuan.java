public class ShuJuLeiXingZhuanHuan {
    byte b1=1, b2=2, b3, b6, b8;
    final byte b4=4, b5=5, b7=7;
    public void fun() {
        b3 = (byte)(b1+b2);
        b6 = (b4+b5);
        //b7 = (b1+b3);
        b8 = (byte)(b1+b4);
    }
    public static void main(String[] args) {
        new ShuJuLeiXingZhuanHuan().fun();
    }
}