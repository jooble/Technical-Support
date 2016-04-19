package by.jooble.service;

import by.jooble.dto.AttributeOfInquiryDto;

import java.util.List;

/**
 * TODO
 */
public interface AttributeOfInquiryService {

    AttributeOfInquiryDto getById(int id);

    void insert(AttributeOfInquiryDto attributeOfInquiryDto);

    List<AttributeOfInquiryDto> getAll();

    void update(AttributeOfInquiryDto attributeOfInquiryDto);

    void delete(AttributeOfInquiryDto attributeOfInquiryDto);
}
