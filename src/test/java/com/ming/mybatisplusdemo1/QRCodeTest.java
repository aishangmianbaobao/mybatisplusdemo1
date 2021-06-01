package com.ming.mybatisplusdemo1;

import com.google.zxing.WriterException;
import com.ming.mybatisplusdemo1.unitl.QRCodeGenerator;
import org.apache.tomcat.util.bcel.classfile.Constant;
import org.junit.jupiter.api.Test;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @ClassName QRCodeTest
 * @Deacription TODO
 * @Author cgm
 * @Date 2021/4/28 11:12
 * @Version 1.0
 **/
public class QRCodeTest {
    QRCodeGenerator qrCodeGenerator = new QRCodeGenerator();
    @Test
    public void helloWord(){

        try {
            qrCodeGenerator.generateQRCodeImage("Hello word",400,400,"C:\\Users\\17306\\Pictures\\png\\heloword.png");
        } catch (WriterException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





}
