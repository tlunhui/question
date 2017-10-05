package org.thethreepig.question.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.thethreepig.question.dao.UserMapper;
import org.thethreepig.question.model.Users;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhaod on 2017/9/21.
 */
@Service
public class UsersService {

    @Autowired
    UserMapper userMapper;

    public List<Users> Login(String userName,String password)
    {
        Map<String,String> map=new HashMap<String, String>();
        map.put("userName",userName);
        map.put("password",password);
        List<Users> list= userMapper.selectSelective(map);
        return list;
    }
}
