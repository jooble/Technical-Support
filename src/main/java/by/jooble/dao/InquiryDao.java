package by.jooble.dao;

import by.jooble.model.Inquiry;

import java.util.List;

/**
 * TODO
 */
public interface InquiryDao extends AbstractDao<Inquiry> {

    List<Inquiry> getByName(String name);
}
