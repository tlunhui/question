package org.thethreepig.question.model;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by 王有名 on 2017/11/14.
 */
public abstract class Param {

    public abstract void check();

    public void checkNotNull(Object value, ResponseEnum status) {
        checkArgs(value != null, status);
    }

    public void checkNotEmpty(String value, ResponseEnum status) {
        checkArgs(StringUtils.isNotBlank(value), status);
    }


    public void checkArgs(boolean success, ResponseEnum status) {
        if (!success) {
            throw new BizException(status);
        }
    }
}