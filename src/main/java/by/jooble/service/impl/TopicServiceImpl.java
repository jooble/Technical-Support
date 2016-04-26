package by.jooble.service.impl;

import by.jooble.dao.TopicDao;
import by.jooble.dto.TopicDto;
import by.jooble.model.Topic;
import by.jooble.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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
    public TopicDto getById(int id) {
        Topic topic = topicDao.getById(id);
        TopicDto topicDto = new TopicDto();

        topicDto.setId(Integer.toString(topic.getId()));
        topicDto.setName(topic.getName());

        return topicDto;
    }

    @Override
    @Transactional
    public void insert(TopicDto topicDto) {
        Topic topic = new Topic();
        topic.setName(topicDto.getName());

        topicDao.insert(topic);
    }

    @Override
    @Transactional(readOnly = true)
    public List<TopicDto> getAll() {
        List<Topic> topics = topicDao.getAll();
        List<TopicDto> topicDtos = new ArrayList<>();

        for (Topic topic : topics) {
            TopicDto topicDto = new TopicDto();
            topicDto.setId(Integer.toString(topic.getId()));
            topicDto.setName(topic.getName());
            topicDtos.add(topicDto);
        }
        return topicDtos;
    }

    @Override
    public void update(TopicDto topicDto) {
        Topic topic = new Topic();
        topic.setId(Integer.parseInt(topicDto.getId()));
        topic.setName(topicDto.getName());

        topicDao.update(topic);
    }

    @Override
    public void delete(TopicDto topicDto) {
        Topic topic = new Topic();
        topic.setId(Integer.parseInt(topicDto.getId()));
        topic.setName(topicDto.getName());

        topicDao.delete(topic);
    }
}
