package demo.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lixuanyu
 * on 2017/7/18.
 */
public interface GenericDao<T extends Serializable> {
    void create(T t);
    T query(String statement,Object parameter);
    List<T> queryAll();
    T queryById(int id);
    void modify(T t);
    void modify(String statement,Object parameter);
    void remove(int id);
}
