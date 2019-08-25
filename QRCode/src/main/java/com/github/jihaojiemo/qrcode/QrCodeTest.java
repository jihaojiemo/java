package com.github.jihaojiemo.qrcode;

/**
 * Description:
 * Author: admin
 * Create: 2019-07-12 13:31
 */
public class QrCodeTest {

    public static void main(String[] args) throws Exception {
        // 嵌入二维码的图片路径
        //String imgPath = "C:\\Users\\admin\\Desktop\\QQ图片20190812130025.png";
        String imgPath = "C:\\Users\\admin\\Desktop\\QQ图片20190812130144.png";
        // 生成的二维码的路径及名称
        //String destPath = "C:\\Users\\admin\\Desktop\\csdn.jpg";
        String destPath = "C:\\\\Users\\\\admin\\\\Desktop\\\\github.jpg";
        //生成二维码
        //QRCodeUtil.encode("https://blog.csdn.net/qq_42351880", imgPath, destPath, true);
        QRCodeUtil.encode("https://github.com/giturtle", imgPath, destPath, true);
    }
}
