package demo.dao;

import demo.model.User;

/**
 * Created by lixuanyu
 * on 2017/7/13.
 */
public interface UserDao {
    void create(User user);
    User signIn(User user);
}
