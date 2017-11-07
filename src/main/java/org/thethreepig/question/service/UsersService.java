package org.thethreepig.question.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thethreepig.question.dao.UsersMapper;
import org.thethreepig.question.model.Users;

import java.util.List;

/**
 * Created by 王有名 on 2017/11/7.
 */
@Service
public class UsersService {
    @Autowired
    UsersMapper usersMapper;

    public List<Users> login(String s, String s1) {
    }
}
