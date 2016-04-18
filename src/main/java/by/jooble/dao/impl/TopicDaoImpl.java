package by.jooble.dao.impl;

import by.jooble.dao.TopicDao;
import by.jooble.model.Topic;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * TODO
 */
@Repository
public class TopicDaoImpl extends AbstractDaoImpl<Topic> implements TopicDao {
    @PostConstruct
    public void init() {
        super.setType(Topic.class);
    }
}
