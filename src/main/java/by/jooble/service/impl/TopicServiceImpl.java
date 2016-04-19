package by.jooble.service.impl;

import by.jooble.dao.TopicDao;
import by.jooble.model.Topic;
import by.jooble.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * TODO
 */
@Service
public class TopicServiceImpl implements TopicService {
    @Autowired
    private TopicDao topicDao;

    @Override
    @Transactional(readOnly = true)
    public Topic getById(int id) {
        return topicDao.getById(id);
    }

    @Override
    @Transactional
    public void insert(Topic topic) {
        topicDao.insert(topic);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Topic> getAll() {
        return topicDao.getAll();
    }

    @Override
    public void update(Topic topic) {
        topicDao.update(topic);
    }

    @Override
    public void delete(Topic topic) {
        topicDao.delete(topic);
    }
}
