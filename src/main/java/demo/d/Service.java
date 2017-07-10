package demo.d;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lixuanyu
 * on 2017/7/6.
 */
public class Service {
    public static void main(String[] args) {
        //使用Spring方式实现输出“Hello，Tom”
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello = (Hello) applicationContext.getBean("hello");
        hello.sayHello();
    }
}
