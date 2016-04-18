package by.jooble.dao.impl;

import by.jooble.dao.InquiryDao;
import by.jooble.model.Inquiry;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * TODO
 */
@Repository
public class InquiryDaoImpl extends AbstractDaoImpl<Inquiry> implements InquiryDao {
    @PostConstruct
    public void init() {
        super.setType(Inquiry.class);
    }
}
