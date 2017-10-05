package org.thethreepig.question.model;

import java.util.Date;

/**
 * Created by zhaod on 2017/9/21.
 */
public class Answers {

    private long id;
    private int userId;
    private String content;
    private Date answersTime;
    private int support;
    private int against;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return answersTime;
    }

    public void setTime(Date answersTime) {
        this.answersTime = answersTime;
    }

    public int getSupport() {
        return support;
    }

    public void setSupport(int support) {
        this.support = support;
    }

    public int getAgainst() {
        return against;
    }

    public void setAgainst(int against) {
        this.against = against;
    }
}
