import com.mapper.UserMapper;
import com.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


public class Mytest {


    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        userMapper.addUser(new User(5, "allen", "23456"));

        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }
    }
}
