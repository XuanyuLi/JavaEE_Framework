package demo.c;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lixuanyu
 * on 2017/7/6.
 */
//IoC Inversion of Control 控制反转
public class Service {
    public static void main(String[] args) {
//        Business business = new Business();
//        business.setDeviceWrite(new UsbWrite());
//        business.write();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Business business = (Business) applicationContext.getBean("business");
        business.write();
    }
}
