package demo.dao.impl;

import demo.dao.BookDao;
import demo.model.Book;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lixuanyu
 * on 2017/7/14.
 */
@Repository
public class BookDaoImpl extends GenericDaoImpl<Book,Integer> implements BookDao {

}
