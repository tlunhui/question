package org.thethreepig.question.model;

import java.util.Date;

/**
 * Created by zhaod on 2017/9/19.
 */
public class Users {
    private int id;
    private String name;
    private String password;
    private Date lastLoginTime;
    private int errorCount;
    private Date lastErrorTime;
    private Date lastPromptTime;
    private boolean deleteed;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }

    public Date getLastErrorTime() {
        return lastErrorTime;
    }

    public void setLastErrorTime(Date lastErrorTime) {
        this.lastErrorTime = lastErrorTime;
    }

    public Date getLastPromptTime() {
        return lastPromptTime;
    }

    public void setLastPromptTime(Date lastPromptTime) {
        this.lastPromptTime = lastPromptTime;
    }
}
