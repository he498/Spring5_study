import com.demo01.dao.UserDaoImpl;
import com.demo01.dao.UserDaoMysqlImpl;
import com.demo01.service.UserService;
import com.demo01.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        UserServiceImpl userService = new UserServiceImpl();
//
//        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());
//
        //spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
