package by.jooble.dao;

import java.util.List;

/**
 * TODO
 */
public interface AbstractDao<T> {
    T getById(int id);

    List<T> getAll();

    void insert(T t);

    void update(T t);

    void delete(T t);
}
