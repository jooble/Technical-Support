package by.jooble.dao.impl;

import by.jooble.dao.InquiryDao;
import by.jooble.model.Inquiry;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * TODO
 */
@Repository
public class InquiryDaoImpl extends AbstractDaoImpl<Inquiry> implements InquiryDao {
    @PostConstruct
    public void init() {
        super.setType(Inquiry.class);
    }


    @Override
    public List<Inquiry> getByName(String name) {
        return getSessionFactory().getCurrentSession().createCriteria(Inquiry.class).add(Restrictions.eq("customerName", name)).list();
    }
}
