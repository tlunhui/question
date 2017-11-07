package org.thethreepig.question.model;

import java.lang.String;
import java.util.Date;

/**
 * @author ikas
 */
public class Users {
    private java.lang.Integer id;
    private java.lang.String name;
    private java.lang.String pwd;
    private java.lang.String nickname;
    private java.util.Date createDate;
    private java.util.Date lastLoginTime;
    private java.lang.Integer errorCount;
    private java.util.Date lastErrorTime;
    private java.lang.Byte deleteed;
    private java.util.Date lastPromptTime;

    public java.lang.Integer getId() {
        return id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getPwd() {
        return pwd;
    }

    public void setPwd(java.lang.String pwd) {
        this.pwd = pwd;
    }

    public java.lang.String getNickname() {
        return nickname;
    }

    public void setNickname(java.lang.String nickname) {
        this.nickname = nickname;
    }

    public java.util.Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    public java.util.Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(java.util.Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public java.lang.Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(java.lang.Integer errorCount) {
        this.errorCount = errorCount;
    }

    public java.util.Date getLastErrorTime() {
        return lastErrorTime;
    }

    public void setLastErrorTime(java.util.Date lastErrorTime) {
        this.lastErrorTime = lastErrorTime;
    }

    public java.lang.Byte getDeleteed() {
        return deleteed;
    }

    public void setDeleteed(java.lang.Byte deleteed) {
        this.deleteed = deleteed;
    }

    public java.util.Date getLastPromptTime() {
        return lastPromptTime;
    }

    public void setLastPromptTime(java.util.Date lastPromptTime) {
        this.lastPromptTime = lastPromptTime;
    }

}
