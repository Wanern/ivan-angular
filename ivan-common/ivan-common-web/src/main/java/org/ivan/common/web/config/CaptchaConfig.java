package org.ivan.common.web.config;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.CircleCaptcha;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.captcha.ShearCaptcha;
import org.ivan.common.web.config.properties.CaptchaProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.awt.*;

/**
 * 验证码配置类
 * created by Lz on 2024/1/7 16:22
 */
@Configuration
@EnableConfigurationProperties(CaptchaProperties.class)
@ConditionalOnProperty(prefix = "ivan.captcha", value = "enabled")
public class CaptchaConfig {

    private CaptchaProperties properties;
    private static final Color BACKGROUND = Color.PINK;

    private static final Font FONT = new Font("Arial", Font.BOLD, 48);

    public CaptchaConfig(CaptchaProperties properties) {
        this.properties = properties;
    }


    /**
     * 圆形干扰验证码
     */
    @Lazy
    @Bean
    public CircleCaptcha createCircleCaptcha() {
        CircleCaptcha captcha = new CircleCaptcha(properties.getWidth(), properties.getHeight());
        captcha.setBackground(BACKGROUND);
        captcha.setFont(FONT);
        return captcha;
    }


    /**
     * 线段干扰的验证码
     */
    @Lazy
    @Bean
    public LineCaptcha lineCaptcha() {
        LineCaptcha captcha = CaptchaUtil.createLineCaptcha(properties.getWidth(), properties.getHeight());
        captcha.setBackground(BACKGROUND);
        captcha.setFont(FONT);
        return captcha;
    }

    /**
     * 扭曲干扰验证码
     */
    @Lazy
    @Bean
    public ShearCaptcha shearCaptcha() {
        ShearCaptcha captcha = CaptchaUtil.createShearCaptcha(properties.getWidth(), properties.getHeight());
        captcha.setBackground(BACKGROUND);
        captcha.setFont(FONT);
        return captcha;
    }

}
