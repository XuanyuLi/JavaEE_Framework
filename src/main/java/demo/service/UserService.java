package demo.service;

import demo.mapper.UserMapper;
import demo.model.User;
import demo.util.MyBatisSession;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixuanyu
 * on 2017/7/4.
 */
public class UserService {
    private InterfaceTest interfaceTest;

    public void setInterfaceTest(InterfaceTest interfaceTest) {
        this.interfaceTest = interfaceTest;
    }

    public int createUser(User user) {
        return interfaceTest.createUser(user);
    }
    public int updateUser(User user) {
        return interfaceTest.updateUser(user);
    }
    public int delecteUser(int id) {
        return interfaceTest.deleteUser(id);
    }
    public List<User> queryAll() {
        return interfaceTest.queryAll();
    }

    public User queryById(int id) {
        return interfaceTest.queryById(id);
    }
}
