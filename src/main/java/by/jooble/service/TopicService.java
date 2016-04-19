package by.jooble.service;

import by.jooble.dto.TopicDto;

import java.util.List;

/**
 * TODO
 */
public interface TopicService {

    TopicDto getById(int id);

    void insert(TopicDto topicDto);

    List<TopicDto> getAll();

    void update(TopicDto topicDto);

    void delete(TopicDto topicDto);
}
