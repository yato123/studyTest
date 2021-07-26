import com.test.spock.Service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import spock.lang.Specification;
public class SpockTest extends Specification {
    @Autowired
    UserServiceImpl userService;
//todo 报错的地方
//    def testGetUser(){
//
//    };
}
