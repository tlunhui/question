package org.thethreepig.question.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.thethreepig.question.dao.TypeMapper;

/**
 * Created by zhaod on 2017/9/21.
 */
@Service
public class TypeService {

    @Autowired
    TypeMapper typeMapper;
}
