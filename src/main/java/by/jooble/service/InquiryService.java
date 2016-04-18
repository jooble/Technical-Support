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

    void update(Inquiry inquiry);

    void deleteById(int id);
}
