package org.thethreepig.question.model;

import java.util.Date;

/**
 * Created by zhaod on 2017/9/21.
 */
public class Type {
    private long id;
    private String TypeName;
    private Date createTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTypeName() {
        return TypeName;
    }

    public void setTypeName(String typeName) {
        TypeName = typeName;
    }

    public Date getTime() {
        return createTime;
    }

    public void setTime(Date createTime) {
        this.createTime = createTime;
    }
}
