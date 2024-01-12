package org.ivan.core.util.rsp;

import org.ivan.core.util.ServletUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Servlet响应写出工具类
 * created by Lz on 2024/1/9 14:15
 */
public class ResponseWriteUtils {

    public static void write(int code, String massage) {
        write(ServletUtils.getResponse(), code, massage);
    }

    public static void write(HttpServletResponse response, int code, String massage) {
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        try (PrintWriter writer = response.getWriter()) {
            writer.write(massage);
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
