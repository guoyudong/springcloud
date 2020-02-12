package com.sinovatio.oceanmind.common.exception;

public class BusinessException extends RuntimeException{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String errcode;

    public BusinessException(){
        super();
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }


    public BusinessException(String errcode,String message, Throwable cause) {
        super(message, cause);
        this.errcode = errcode;
    }

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    


}
