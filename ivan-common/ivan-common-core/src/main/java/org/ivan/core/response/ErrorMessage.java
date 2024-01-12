package org.ivan.core.response;

import java.io.Serializable;

/**
 * 错误消息
 * created by Lz on 2024/1/10 11:22
 */
public class ErrorMessage implements Serializable {

    /**
     * 错误级别
     */
    private int errorLevel;

    /**
     * 错误码
     */
    private int errorCode;

    /**
     * 友好提示
     */
    private String friendlyMessage;

    /**
     * 详细的提示
     */
    private String detailedMessage;


    public ErrorMessage(ErrorLevel errLevel, int errorCode, String friendlyMessage, String detailedMessage) {
        this.errorCode = errorCode;
        this.errorLevel = errLevel.getLevel();
        this.friendlyMessage = friendlyMessage;
        this.detailedMessage = detailedMessage;
    }


    public ErrorMessage(int errorLevel, int errorCode, String friendlyMessage, String detailedMessage) {
        this.errorLevel = errorLevel;
        this.errorCode = errorCode;
        this.friendlyMessage = friendlyMessage;
        this.detailedMessage = detailedMessage;
    }


    public int getErrorLevel() {
        return errorLevel;
    }

    public void setErrorLevel(int errorLevel) {
        this.errorLevel = errorLevel;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getFriendlyMessage() {
        return friendlyMessage;
    }

    public void setFriendlyMessage(String friendlyMessage) {
        this.friendlyMessage = friendlyMessage;
    }

    public String getDetailedMessage() {
        return detailedMessage;
    }

    public void setDetailedMessage(String detailedMessage) {
        this.detailedMessage = detailedMessage;
    }
}
