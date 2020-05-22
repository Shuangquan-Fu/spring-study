import com.kuang.mapper.UserMapper;
import com.kuang.mapper.UserMapperImpl;
import com.kuang.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.security.util.Resources_zh_TW;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    @Test
    public void test() throws IOException {

        ClassPathXmlApplicationContext cont = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapperImpl mapper = (UserMapperImpl) cont.getBean("userMapper");
        List<User> users = mapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }

    }
}
