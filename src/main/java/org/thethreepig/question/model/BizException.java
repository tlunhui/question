package org.thethreepig.question.model;

/**
 * Created by 王有名 on 2017/11/14.
 */
public class BizException extends  RuntimeException{
    private ResponseEnum status;

    public BizException(ResponseEnum status) {
        super();
        this.status = status;
    }

    public ResponseEnum getStatus() {
        return status;
    }

    public void setStatus(ResponseEnum status) {
        this.status = status;
    }

}
