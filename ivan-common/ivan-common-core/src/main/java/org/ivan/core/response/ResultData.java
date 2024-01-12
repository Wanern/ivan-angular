package org.ivan.core.response;

import java.io.Serializable;

/**
 * 响应数据
 * created by Lz on 2024/1/10 10:58
 */
public class ResultData<T> implements Serializable {

    private boolean success;

    /**
     * 响应码
     * 成功 200
     * 失败参考 ErrorLevel.level
     */
    private int code;

    /**
     * 响应数据
     * 成功为正常响应结果
     * 失败为ErrorMessage
     */
    private T data;

    private ResultData() {
    }

    private ResultData(boolean success, int code, T data) {
        this.code = code;
        this.data = data;
    }

    public static ResultData success() {
        return new ResultData(true, 200, null);
    }

    //public static ResultData error(ErrorLevel errorLevel, int code) {
    //    return error(errorLevel, code, I18nMessageUtils.getMessage(String.valueOf(code)));
    //}

    public static ResultData error(ErrorLevel errLevel, int code, String friendlyMessage) {
        return error(errLevel, code, friendlyMessage, "");
    }

    public static ResultData error(ErrorLevel errLevel, int code, String friendlyMessage, String detailedMessage) {
        ErrorMessage errorMessage = new ErrorMessage(errLevel, code, friendlyMessage, detailedMessage);
        return error(errorMessage);
    }

    public static ResultData error(ErrorMessage errorMessage) {
        return new ResultData(false, errorMessage.getErrorLevel(), errorMessage);
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public ResultData setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "ResultData{" +
                "success=" + success +
                ", code=" + code +
                ", data=" + data +
                '}';
    }
}
