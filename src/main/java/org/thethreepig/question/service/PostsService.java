package org.thethreepig.question.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.thethreepig.question.dao.PostsMapper;

/**
 * Created by zhaod on 2017/9/21.
 */
@Component
public class PostsService {

    @Autowired
    PostsMapper postsMapper;
}
