package org.thethreepig.question.model;

import java.lang.String;
import java.util.Date;

/**
 * @author ikas
 */
public class Problem {
    private java.lang.Integer problemId;
    private java.lang.String title;
    private java.lang.Integer usersId;
    private java.lang.Integer usersName;
    private java.util.Date createTime;
    private java.util.Date updateTime;
    private java.lang.Integer voteCount;
    private java.lang.Integer viewCount;
    private java.lang.Integer answerCount;
    private java.lang.Object content;
    private java.lang.Byte deleteed;

    public java.lang.Integer getProblemId() {
        return problemId;
    }

    public void setProblemId(java.lang.Integer problemId) {
        this.problemId = problemId;
    }

    public java.lang.String getTitle() {
        return title;
    }

    public void setTitle(java.lang.String title) {
        this.title = title;
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

    public java.util.Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public java.lang.Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(java.lang.Integer voteCount) {
        this.voteCount = voteCount;
    }

    public java.lang.Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(java.lang.Integer viewCount) {
        this.viewCount = viewCount;
    }

    public java.lang.Integer getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(java.lang.Integer answerCount) {
        this.answerCount = answerCount;
    }

    public java.lang.Object getContent() {
        return content;
    }

    public void setContent(java.lang.Object content) {
        this.content = content;
    }

    public java.lang.Byte getDeleteed() {
        return deleteed;
    }

    public void setDeleteed(java.lang.Byte deleteed) {
        this.deleteed = deleteed;
    }

}
