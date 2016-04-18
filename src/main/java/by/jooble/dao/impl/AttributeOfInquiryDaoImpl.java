package by.jooble.dao.impl;

import by.jooble.dao.AttributeOfInquiryDao;
import by.jooble.model.AttributeOfInquiry;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * TODO
 */
@Repository
public class AttributeOfInquiryDaoImpl extends AbstractDaoImpl<AttributeOfInquiry> implements AttributeOfInquiryDao {
    @PostConstruct
    public void init() {
        super.setType(AttributeOfInquiry.class);
    }
}
