package org.ivan.core.exception;

import org.ivan.core.response.ErrorLevel;

/**
 * 自定义业务异常
 * created by Lz on 2024/1/10 15:16
 */
public class BizException extends RuntimeException {
    private int errorCode;

    private ErrorLevel errorLevel;

    private String friendlyMessage;

    private String detailMessage;

    public BizException(ErrorLevel errorLevel, int code, String friendlyMessage, String detailMessage) {
        super(friendlyMessage);
        this.errorLevel = errorLevel;
        this.errorCode = code;
        this.friendlyMessage = friendlyMessage;
        this.detailMessage = detailMessage;
    }

    public BizException(ErrorLevel errorLevel, int code, String friendlyMessage) {
        super(friendlyMessage);
        this.errorLevel = errorLevel;
        this.errorCode = code;
        this.friendlyMessage = friendlyMessage;
        this.detailMessage = "";
    }


    public int getErrorCode() {
        return errorCode;
    }

    public ErrorLevel getErrorLevel() {
        return errorLevel;
    }

    public String getFriendlyMessage() {
        return friendlyMessage;
    }

    public String getDetailMessage() {
        return detailMessage;
    }
}
