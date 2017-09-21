package org.thethreepig.question.dao;

import java.util.List;

/**
 * Created by zhaod on 2017/9/21.
 * mybatis dao层父类接口方法
 */
public interface BaseMapper<T> {
    T selectByPrimaryKey(Object obj);
    List<T> selectSelective(Object obj);
    Number countSelective(Object obj);
    void deleteByPrimaryKey(Object obj);
    void deleteSelective(Object obj);
    void insert(Object obj);
    void updateByPrimaryKey(Object obj);
    void updateSelective(Object obj);
}
