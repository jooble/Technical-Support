package by.jooble.service;

import by.jooble.model.Inquiry;

import java.util.List;

/**
 * TODO
 */
public interface InquiryService {

    Inquiry getById(int id);

    void insert(Inquiry inquiry);

    List<Inquiry> getAll();

    List<Inquiry> getByName(String name);

    void update(Inquiry inquiry);

    void delete(Inquiry inquiry);
}
