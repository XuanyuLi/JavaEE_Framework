package demo.service;

import java.util.List;

/**
 * Created by lixuanyu
 * on 2017/7/18.
 */
public interface GenericService<T> {
    void create(T t);

    T query(String statement, Object parameter);

    List<T> queryAll();

//    List<T> queryList(String statement, Object parameter);

    T queryById(int id);

    void modify(T t);

    void modify(String statement, Object parameter);

    void remove(int id);
}
