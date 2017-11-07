package org.thethreepig.question.model;

import java.lang.String;
import java.util.Date;

/**
 * @author ikas
 */
public class Answer {
    private java.lang.Integer answerId;
    private java.util.Date createTime;
    private java.lang.Integer usersId;
    private java.lang.Integer usersName;
    private java.lang.Integer agreeCount;
    private java.lang.Integer oppositionCount;
    private java.lang.Byte adopt;
    private java.lang.Byte deleteed;
    private java.lang.Integer feedBack;
    private java.lang.Object content;
    private java.lang.Integer problemId;

    public java.lang.Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(java.lang.Integer answerId) {
        this.answerId = answerId;
    }

    public java.util.Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.lang.Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(java.lang.Integer usersId) {
        this.usersId = usersId;
    }

    public java.lang.Integer getUsersName() {
        return usersName;
    }

    public void setUsersName(java.lang.Integer usersName) {
        this.usersName = usersName;
    }

    public java.lang.Integer getAgreeCount() {
        return agreeCount;
    }

    public void setAgreeCount(java.lang.Integer agreeCount) {
        this.agreeCount = agreeCount;
    }

    public java.lang.Integer getOppositionCount() {
        return oppositionCount;
    }

    public void setOppositionCount(java.lang.Integer oppositionCount) {
        this.oppositionCount = oppositionCount;
    }

    public java.lang.Byte getAdopt() {
        return adopt;
    }

    public void setAdopt(java.lang.Byte adopt) {
        this.adopt = adopt;
    }

    public java.lang.Byte getDeleteed() {
        return deleteed;
    }

    public void setDeleteed(java.lang.Byte deleteed) {
        this.deleteed = deleteed;
    }

    public java.lang.Integer getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(java.lang.Integer feedBack) {
        this.feedBack = feedBack;
    }

    public java.lang.Object getContent() {
        return content;
    }

    public void setContent(java.lang.Object content) {
        this.content = content;
    }

    public java.lang.Integer getProblemId() {
        return problemId;
    }

    public void setProblemId(java.lang.Integer problemId) {
        this.problemId = problemId;
    }

}
