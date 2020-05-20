import com.kuang.dao.UserDao;
import com.kuang.dao.UserDaoImpl;
import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;

public class Mytest {
    public static void main(String[] args) {
        //用户实际访问的service 层不会去碰触Dao 层
        //现在的弊端是 如果需要通过 sql来访问数据就很麻烦 ， 因为dao 要写，service中的实现类就要修改
        UserService userService = new UserServiceImpl();

        ((UserServiceImpl) userService).setUserDao(new UserDaoImpl());
        userService.getUser();


    }
}
