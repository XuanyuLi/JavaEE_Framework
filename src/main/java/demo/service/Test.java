package demo.service;

import demo.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by lixuanyu
 * on 2017/7/7.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test/applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");

//        User user = new User("123","123");
//        userService.createUser(user);
        for (User user : userService.queryAll()) {
            System.out.println(user.getUsername());
        }


    }
}
