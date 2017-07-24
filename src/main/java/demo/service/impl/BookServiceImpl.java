package demo.service.impl;

import demo.dao.GenericDao;
import demo.model.Book;
import demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by lixuanyu
 * on 2017/7/18.
 */
@Service
public class BookServiceImpl extends GenericServiceImpl<Book,Integer> implements BookService {
    @Override
    @Autowired
    @Qualifier("bookDaoImpl")
    public void setGenericDao(GenericDao<Book,Integer> genericDao) {
        super.genericDao = genericDao;
    }
}
