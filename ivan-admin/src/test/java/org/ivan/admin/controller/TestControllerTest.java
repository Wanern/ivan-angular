package org.ivan.admin.controller;


import org.ivan.core.i18n.I18nMessageUtils;
import org.ivan.core.response.ResultData;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Locale;

/**
 * TODO: Delete todo after editing description
 * created by Lz on 2024/1/8 16:06
 */
@SpringBootTest
public class TestControllerTest {

    //@Resource
    //private CircleCaptcha captcha;


    @Test
    public void t001() {
        //SimpleLocaleContext context = new SimpleLocaleContext(Locale.US);
        //LocaleContextHolder.setLocaleContext(context);

        LocaleContextHolder.setLocale(Locale.CHINA);
        String message = I18nMessageUtils.getMessage("100001");
        System.out.println(message);


        ResultData<String> result = ResultData.success().setData("sss");
        String data = result.getData();
        System.out.println(data);
        //ResponseWriteUtils.write(200, "测试方法");
        //System.out.println("测试方法");
        //String imageBase64 = captcha.getImageBase64();
        //System.out.println(imageBase64);
    }
}