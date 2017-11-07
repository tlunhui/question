package org.thethreepig.question.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thethreepig.question.dao.LabelMapper;

/**
 * Created by 王有名 on 2017/11/7.
 */

@Service
public class LabelService {

    @Autowired
    LabelMapper labelMapper;
}
