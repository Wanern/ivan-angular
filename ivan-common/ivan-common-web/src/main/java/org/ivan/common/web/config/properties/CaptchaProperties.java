package org.ivan.common.web.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 验证码配置类
 * created by Lz on 2024/1/7 16:23
 */
@ConfigurationProperties(prefix = "ivan.captcha")
public class CaptchaProperties {

    /**
     * 是否开启验证码
     */
    private boolean enable;

    /**
     * 验证码类型
     */
    private String type;

    /**
     * 图片宽度
     */
    private int width = 100;

    /**
     * 图片高度
     */
    private int height = 30;

    /**
     * 字符模式下
     * 验证码字符长度 默认4个字符
     */
    private int charLength = 4;


    /**
     * 数字模式下
     * 验证码数字长度 默认2个字符
     */
    private int numberLength = 2;

    public CaptchaProperties() {
    }

    public CaptchaProperties(boolean enable, int width, int height, int charLength, int numberLength) {
        this.enable = enable;
        this.width = width;
        this.height = height;
        this.charLength = charLength;
        this.numberLength = numberLength;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getCharLength() {
        return charLength;
    }

    public void setCharLength(int charLength) {
        this.charLength = charLength;
    }

    public int getNumberLength() {
        return numberLength;
    }

    public void setNumberLength(int numberLength) {
        this.numberLength = numberLength;
    }

    @Override
    public String toString() {
        return "CaptchaProperties{" +
                "enable=" + enable +
                ", width=" + width +
                ", height=" + height +
                ", charLength=" + charLength +
                ", numberLength=" + numberLength +
                '}';
    }
}
