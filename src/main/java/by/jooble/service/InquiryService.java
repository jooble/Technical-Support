package by.jooble.service;

import by.jooble.dto.InquiryDto;

import java.util.List;

/**
 * TODO
 */
public interface InquiryService {

    InquiryDto getById(int id);

    void insert(InquiryDto inquiryDto);

    List<InquiryDto> getAll();

    List<InquiryDto> getByName(String name);

    void update(InquiryDto inquiryDto);

    void delete(InquiryDto inquiryDto);
}
