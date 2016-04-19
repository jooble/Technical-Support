package by.jooble.dao.impl;

import by.jooble.dao.AbstractDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * TODO
 */
public class AbstractDaoImpl<T> implements AbstractDao<T> {

    @Autowired
    protected SessionFactory sessionFactory;

    private Class<T> type;

    public void setType(Class<T> type) {
        this.type = type;
    }

    @Override
    public T getById(int id) {
        return (T) sessionFactory.getCurrentSession().get(type, id);
    }

    @Override
    public void insert(Object emp) {
        sessionFactory.getCurrentSession().save(emp);
    }

    @Override
    public List<T> getAll() {
        return sessionFactory.getCurrentSession().createCriteria(type).list();
    }

    @Override
    public void update(Object emp) {
        sessionFactory.getCurrentSession().update(emp);
    }

    @Override
    public void deleteById(int id) {
        T emp = (T) sessionFactory.getCurrentSession().get(type, id);
        sessionFactory.getCurrentSession().delete(emp);
    }
}

