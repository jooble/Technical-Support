package by.jooble.service;

import by.jooble.model.AttributeOfInquiry;

import java.util.List;

/**
 * TODO
 */
public interface AttributeOfInquiryService {

    AttributeOfInquiry getById(int id);

    void insert(AttributeOfInquiry attributeOfInquiry);

    List<AttributeOfInquiry> getAll();

    void update(AttributeOfInquiry attributeOfInquiry);

    void delete(AttributeOfInquiry attributeOfInquiry);
}
