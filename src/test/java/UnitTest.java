import org.junit.Test;
import org.thethreepig.question.dao.BaseMapper;
import org.thethreepig.question.dao.UserMapper;
import org.thethreepig.question.model.Users;
import org.thethreepig.question.service.UsersService;

import java.util.HashMap;
import java.util.List;

/**
 * Created by zhaod on 2017/9/28.
 */
public class UnitTest {
    @Test
    public void Test() {

        UsersService usersService=new UsersService();
        List<Users> list= usersService.Login("123456","123456");
    }
}
