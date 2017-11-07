package org.thethreepig.question.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thethreepig.question.dao.AnswerMapper;

/**
 * Created by 王有名 on 2017/9/21.
 */
@Service
public class AnswersService {

    @Autowired
    AnswerMapper answerMepper;
}
