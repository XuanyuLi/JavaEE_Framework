package demo.dao;
import demo.model.Book;
import java.util.List;

/**
 * Created by lixuanyu
 * on 2017/7/14.
 */
public interface BookDao {
    void create(Book book);
    List<Book> queryAll();
    Book queryBookById(int id);
    void modify(Book book);
    void remove(int id);
}
