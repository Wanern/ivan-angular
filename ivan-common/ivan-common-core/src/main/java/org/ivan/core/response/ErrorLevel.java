package org.ivan.core.response;

/**
 * 异常消息错误级别
 * created by Lz on 2024/1/10 11:26
 */
public enum ErrorLevel {

    /**
     * 系统错误
     */
    SYSTEM(1),

    /**
     * 会话超时
     */
    SESSION_TIMEOUT(2),

    /**
     * 权限不足
     */
    PERMISSION_DENIED(3),

    /**
     * 网络错误
     */
    NETWORK_ERROR(4),

    /**
     * 用户错误
     */
    USER(100);


    private int level;

    ErrorLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
