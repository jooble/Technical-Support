package by.jooble.service.impl;

import by.jooble.dao.AttributeOfInquiryDao;
import by.jooble.model.AttributeOfInquiry;
import by.jooble.service.AttributeOfInquiryService;
import by.jooble.dto.AttributeOfInquiryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 */
@Service
public class AttributeOfInquiryServiceImpl implements AttributeOfInquiryService {
    @Autowired
    private AttributeOfInquiryDao attributeOfInquiryDao;

    @Override
    @Transactional(readOnly = true)
    public AttributeOfInquiryDto getById(int id) {
        AttributeOfInquiry attributeOfInquiry = attributeOfInquiryDao.getById(id);
        AttributeOfInquiryDto attributeOfInquiryDto = new AttributeOfInquiryDto();

        attributeOfInquiryDto.setId(Integer.toString(attributeOfInquiry.getId()));
        attributeOfInquiryDto.setName(attributeOfInquiry.getName());
        attributeOfInquiryDto.setValue(attributeOfInquiry.getValue());

        return attributeOfInquiryDto;
    }

    @Override
    @Transactional
    public void insert(AttributeOfInquiryDto attributeOfInquiryDto) {
        AttributeOfInquiry attributeOfInquiry = new AttributeOfInquiry();
        attributeOfInquiry.setName(attributeOfInquiryDto.getName());
        attributeOfInquiry.setValue(attributeOfInquiryDto.getValue());
        attributeOfInquiryDao.insert(attributeOfInquiry);
    }

    @Override
    @Transactional(readOnly = true)
    public List<AttributeOfInquiryDto> getAll() {
        List<AttributeOfInquiry> attributeOfInquiries = attributeOfInquiryDao.getAll();
        List<AttributeOfInquiryDto> attributeOfInquiryDtos = new ArrayList<>();

        for (AttributeOfInquiry attributeOfInquiry : attributeOfInquiries) {
            AttributeOfInquiryDto attributeOfInquiryDto = new AttributeOfInquiryDto();

            attributeOfInquiryDto.setId(Integer.toString(attributeOfInquiry.getId()));
            attributeOfInquiryDto.setName(attributeOfInquiry.getName());
            attributeOfInquiryDto.setValue(attributeOfInquiry.getValue());

            attributeOfInquiryDtos.add(attributeOfInquiryDto);
        }
        return attributeOfInquiryDtos;
    }

    @Override
    public void update(AttributeOfInquiryDto attributeOfInquiryDto) {
        AttributeOfInquiry attributeOfInquiry = new AttributeOfInquiry();

        attributeOfInquiry.setId(Integer.parseInt(attributeOfInquiryDto.getId()));
        attributeOfInquiry.setName(attributeOfInquiryDto.getName());
        attributeOfInquiry.setValue(attributeOfInquiryDto.getValue());

        attributeOfInquiryDao.insert(attributeOfInquiry);
    }

    @Override
    public void delete(AttributeOfInquiryDto attributeOfInquiryDto) {
        AttributeOfInquiry attributeOfInquiry = new AttributeOfInquiry();

        attributeOfInquiry.setId(Integer.parseInt(attributeOfInquiryDto.getId()));
        attributeOfInquiry.setName(attributeOfInquiryDto.getName());
        attributeOfInquiry.setValue(attributeOfInquiryDto.getValue());

        attributeOfInquiryDao.delete(attributeOfInquiry);
    }
}
