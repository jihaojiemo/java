package com.github.jihaojiemo.qrcode;

/**
 * Description:
 * Author: admin
 * Create: 2019-07-12 13:31
 */
public class QrCodeTest {

    public static void main(String[] args) throws Exception {
        // 存放在二维码中的内容
        String text = "我是小铭";
        // 嵌入二维码的图片路径
        //String imgPath = "G:/qrCode/dog.jpg";
        // 生成的二维码的路径及名称
        String destPath = "E:\\qrcode\\github.jpg";
        //生成二维码
        //QRCodeUtil.encode("https://blog.csdn.net/qq_43508801", null, destPath, true);
        QRCodeUtil.encode("https://github.com/jihaojiemo?tab=repositories", null, destPath, true);

        // 解析二维码
        String str = QRCodeUtil.decode(destPath);
        // 打印出解析出的内容
        System.out.println(str);

    }
}
