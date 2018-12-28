package com.moon.ancientpoetry.web.constant;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/28 17:40
 * @Description:
 */
public enum  UserErrorCode {
    ;
    /** 错误编码 */
    private int errorCode;
    /** 错误信息 */
    private String errorMessage;

    UserErrorCode(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
