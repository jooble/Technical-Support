package by.jooble.service.impl;

import by.jooble.dao.AttributeOfInquiryDao;
import by.jooble.model.AttributeOfInquiry;
import by.jooble.service.AttributeOfInquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * TODO
 */
@Service
public class AttributeOfInquiryServiceImpl implements AttributeOfInquiryService {

    @Autowired
    private AttributeOfInquiryDao attributeOfInquiryDao;

    @Override
    @Transactional(readOnly = true)
    public AttributeOfInquiry getById(int id) {
        return attributeOfInquiryDao.getById(id);
    }

    @Override
    @Transactional
    public void insert(AttributeOfInquiry attributeOfInquiry) {
        attributeOfInquiryDao.insert(attributeOfInquiry);
    }

    @Override
    @Transactional(readOnly = true)
    public List<AttributeOfInquiry> getAll() {
        return attributeOfInquiryDao.getAll();
    }

    @Override
    public void update(AttributeOfInquiry attributeOfInquirya) {
        attributeOfInquiryDao.update(attributeOfInquirya);
    }

    @Override
    public void deleteById(int id) {
        attributeOfInquiryDao.deleteById(id);
    }
}
