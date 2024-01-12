package org.ivan.core.i18n;

import org.ivan.core.i18n.constant.I18nResponseConst;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.nio.charset.StandardCharsets;

/**
 * 国际化响应消息工具类
 * created by Lz on 2024/1/10 10:54
 */
public class I18nMessageUtils {

    private I18nMessageUtils() {
    }

    private static final ReloadableResourceBundleMessageSource MESSAGE_SOURCE;

    static {
        MESSAGE_SOURCE = new ReloadableResourceBundleMessageSource();
        MESSAGE_SOURCE.setDefaultEncoding(StandardCharsets.UTF_8.name());
    }


    public static String getMessage(String code) {
        return getMessage(I18nResponseConst.DEFAULT_MESSAGE_CLASSPATH, code);
    }

    public static String getMessage(String classPath, String code) {
        MESSAGE_SOURCE.setBasename(classPath);
        return MESSAGE_SOURCE.getMessage(code, null, LocaleContextHolder.getLocale());
    }
}
