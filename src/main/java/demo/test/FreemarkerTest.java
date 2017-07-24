package demo.test;

import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lixuanyu
 * on 2017/7/19.
 */
public class FreemarkerTest {
    public static void main(String[] args) throws IOException, TemplateException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        FreeMarkerConfig freeMarkerConfig = (FreeMarkerConfig) applicationContext.getBean("freemarker");

        Template template = freeMarkerConfig.getConfiguration().getTemplate("model.ftl"); // 1. Template
        Map<String, String> map = new HashMap<>(); // 2. Java Object
        map.put("model", "Student");
        Writer writer = new FileWriter("src/main/java/demo/model/Student.java"); // 3. Output
        template.process(map, writer); // Freemarker Processing...
    }
}
