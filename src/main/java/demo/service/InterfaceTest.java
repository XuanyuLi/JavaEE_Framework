package demo.service;

import demo.model.User;

import java.util.List;

/**
 * Created by lixuanyu
 * on 2017/7/7.
 */
public interface InterfaceTest {
    int createUser(User user);
    int updateUser(User user);
    int deleteUser(int id);

    List<User> queryAll();
    User queryById(int id);
}
