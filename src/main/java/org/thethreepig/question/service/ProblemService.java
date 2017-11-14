package org.thethreepig.question.service;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thethreepig.question.dao.ProblemMapper;
import org.thethreepig.question.model.Problem;

import java.util.List;

/**
 * Created by 王有名 on 2017/11/7.
 */
@Service
public class ProblemService {

    @Autowired
    ProblemMapper problemMapper;

    /**
     * 获取最新的问题
     * */
    public List<Problem> getNewProblem(int page) {
        PageHelper.startPage(page,10);
        PageHelper.orderBy("create_time desc");
        return problemMapper.qeuryBySelective(new Problem());
    }
}
