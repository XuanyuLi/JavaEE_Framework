package demo.service;

import demo.model.User;

/**
 * Created by lixuanyu
 * on 2017/7/4.
 */
public interface UserService extends GenericService<User,Integer> {
    User signIn(User user);

    boolean signUp(User user);
}
