package by.jooble.service.impl;

import by.jooble.dao.InquiryDao;
import by.jooble.model.Inquiry;
import by.jooble.service.InquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * TODO
 */
@Service
public class InquiryServiceImpl implements InquiryService {
    @Autowired
    private InquiryDao inquiryDao;

    @Override
    @Transactional(readOnly = true)
    public Inquiry getById(int id) {
        return inquiryDao.getById(id);
    }

    @Override
    @Transactional
    public void insert(Inquiry inquiry) {
        inquiryDao.insert(inquiry);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Inquiry> getAll() {
        return inquiryDao.getAll();
    }

    @Override
    public void update(Inquiry inquiry) {
        inquiryDao.update(inquiry);
    }

    @Override
    public void deleteById(int id) {
        inquiryDao.deleteById(id);
    }
}
