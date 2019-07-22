package com.github.jihaojiemo.qrcode;

/**
 * Description:
 * Author: admin
 * Create: 2019-07-12 13:31
 */
public class QrCodeTest {

    public static void main(String[] args) throws Exception {
        // 嵌入二维码的图片路径
        String imgPath = "C:\\Users\\admin\\Desktop\\31d921d262ca0c92b705ed50c9c07d66.jpg";
        //String imgPath = "C:\\Users\\admin\\Desktop\\2918d47d21591bd9243f0c2a81a8a170.jpg";
        // 生成的二维码的路径及名称
        String destPath = "E:\\二维码\\csdn.jpg";
        //String destPath = "E:\\二维码\\github.jpg";
        //生成二维码
        QRCodeUtil.encode("https://blog.csdn.net/qq_43508801", imgPath, destPath, true);
        //QRCodeUtil.encode("https://github.com/jihaojiemo?tab=repositories", imgPath, destPath, true);
    }
}
