import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.thethreepig.question.model.Problem;
import org.thethreepig.question.model.Users;
import org.thethreepig.question.service.ProblemService;
import org.thethreepig.question.service.UsersService;

import java.util.List;

/**
 * Created by 王有名 on 2017/9/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:root-context.xml")
public class UnitTest {

    @Autowired
    private UsersService usersService;

    @Autowired
    private ProblemService problemService;

    @Test
    public void main(){
       List<Problem> list=  problemService.getNewProblem(0);
    }
}
