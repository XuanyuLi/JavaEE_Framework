package demo.dao.impl;

import demo.dao.UserDao;
import demo.model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by lixuanyu
 * on 2017/7/13.
 */
@Repository
public class UserDaoImpl extends GenericDaoImpl<User,Integer> implements UserDao{

}
