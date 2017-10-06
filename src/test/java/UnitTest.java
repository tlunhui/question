import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.thethreepig.question.dao.BaseMapper;
import org.thethreepig.question.dao.UserMapper;
import org.thethreepig.question.model.Users;
import org.thethreepig.question.service.UsersService;

import java.util.HashMap;
import java.util.List;

/**
 * Created by zhaod on 2017/9/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:root-context.xml")
public class UnitTest {

    @Autowired
    private UsersService usersService;

    @Test
    public void Test() {
        List<Users> list= usersService.login("123456","123456");
        Assert.assertEquals(1,list.size());
    }
}
