package by.jooble.service;

import by.jooble.model.Topic;

import java.util.List;

/**
 * TODO
 */
public interface TopicService {

    Topic getById(int id);

    void insert(Topic topic);

    List<Topic> getAll();

    void update(Topic topic);

    void delete(Topic topic);
}
