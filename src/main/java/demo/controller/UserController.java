package demo.controller;

import demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lixuanyu
 * on 2017/7/10.
 */
@Controller
@RequestMapping("user")

public class UserController {

    @RequestMapping("create")
    private String create(User user) {
        // TODO: 7/10/17 save user...
        System.out.println("create...");
        return "redirect:/index.jsp";
    }
}

