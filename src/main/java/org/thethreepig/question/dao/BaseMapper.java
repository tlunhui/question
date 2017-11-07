package org.thethreepig.question.dao;

import java.util.List;

public interface BaseMapper<T> {
    List<T> qeuryBySelective(T t);
    long qeuryCountBySelective(T t);
    long queryCount(T t);
    List<T> getById(Integer id);
    int insert(T t);
    int update(T t);
    int updateSelectiveById(Integer id);
    int deleteById(Integer id);
    int deleteBySelective(T t);
}
