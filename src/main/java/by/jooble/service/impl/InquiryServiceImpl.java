package by.jooble.service.impl;

import by.jooble.dao.InquiryDao;
import by.jooble.model.AttributeOfInquiry;
import by.jooble.model.Inquiry;
import by.jooble.model.Topic;
import by.jooble.service.InquiryService;
import by.jooble.dto.AttributeOfInquiryDto;
import by.jooble.dto.InquiryDto;
import by.jooble.dto.TopicDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 */
@Service
public class InquiryServiceImpl implements InquiryService {
    @Autowired
    private InquiryDao inquiryDao;

    @Override
    @Transactional(readOnly = true)
    public InquiryDto getById(int id) {
        Inquiry inquiry = inquiryDao.getById(id);
        InquiryDto inquiryDto = new InquiryDto();

        inquiryDto.setId(Integer.toString(inquiry.getId()));

        TopicDto topicDto = new TopicDto();
        topicDto.setId(Integer.toString(inquiry.getTopic().getId()));
        topicDto.setName(inquiry.getTopic().getName());
        inquiryDto.setTopicDto(topicDto);

        inquiryDto.setCustomerName(inquiry.getCustomerName());
        inquiryDto.setCreateDate(inquiry.getCreateDate());
        inquiryDto.setDescription(inquiry.getDescription());

        if (inquiry.getAttributeOfInquiry() != null) {
            List<AttributeOfInquiryDto> attributeOfInquiryDtos = new ArrayList<>();
            for (AttributeOfInquiry attributeOfInquiry : inquiry.getAttributeOfInquiry()) {
                AttributeOfInquiryDto attributeOfInquiryDto = new AttributeOfInquiryDto();

                attributeOfInquiryDto.setId(Integer.toString(attributeOfInquiry.getId()));
                attributeOfInquiryDto.setName(attributeOfInquiry.getName());
                attributeOfInquiryDto.setValue(attributeOfInquiry.getValue());

                attributeOfInquiryDtos.add(attributeOfInquiryDto);
            }
            inquiryDto.setAttributeOfInquiryDtos(attributeOfInquiryDtos);
        }
        return inquiryDto;
    }

    @Override
    @Transactional
    public void insert(InquiryDto inquiryDto) {
        Inquiry inquiry = new Inquiry();

        Topic topic = new Topic();
        topic.setId(Integer.parseInt(inquiryDto.getTopicDto().getId()));
        topic.setName(inquiryDto.getTopicDto().getName());
        inquiry.setTopic(topic);

        inquiry.setCreateDate(inquiryDto.getCreateDate());
        inquiry.setDescription(inquiryDto.getDescription());

        if (inquiryDto.getAttributeOfInquiryDtos() != null) {
            List<AttributeOfInquiry> attributeOfInquiries = new ArrayList<>();
            for (AttributeOfInquiryDto attributeOfInquiryDto : inquiryDto.getAttributeOfInquiryDtos()) {
                AttributeOfInquiry attributeOfInquiry = new AttributeOfInquiry();

                attributeOfInquiry.setId(Integer.parseInt(attributeOfInquiryDto.getId()));
                attributeOfInquiry.setName(attributeOfInquiryDto.getName());
                attributeOfInquiry.setValue(attributeOfInquiryDto.getValue());

                attributeOfInquiries.add(attributeOfInquiry);
            }
            inquiry.setAttributeOfInquiry(attributeOfInquiries);
        }
        inquiryDao.insert(inquiry);
    }

    @Override
    @Transactional(readOnly = true)
    public List<InquiryDto> getAll() {
        List<Inquiry> inquiries = inquiryDao.getAll();
        List<InquiryDto> inquiryDtos = new ArrayList<>();

        for (Inquiry inquiry : inquiries) {
            InquiryDto inquiryDto = new InquiryDto();

            inquiryDto.setId(Integer.toString(inquiry.getId()));

            TopicDto topicDto = new TopicDto();
            topicDto.setId(Integer.toString(inquiry.getTopic().getId()));
            topicDto.setName(inquiry.getTopic().getName());
            inquiryDto.setTopicDto(topicDto);

            inquiryDto.setCustomerName(inquiry.getCustomerName());
            inquiryDto.setCreateDate(inquiry.getCreateDate());
            inquiryDto.setDescription(inquiry.getDescription());

            if (inquiry.getAttributeOfInquiry() != null) {
                List<AttributeOfInquiryDto> attributeOfInquiryDtos = new ArrayList<>();
                for (AttributeOfInquiry attributeOfInquiry : inquiry.getAttributeOfInquiry()) {
                    AttributeOfInquiryDto attributeOfInquiryDto = new AttributeOfInquiryDto();

                    attributeOfInquiryDto.setId(Integer.toString(attributeOfInquiry.getId()));
                    attributeOfInquiryDto.setName(attributeOfInquiry.getName());
                    attributeOfInquiryDto.setValue(attributeOfInquiry.getValue());

                    attributeOfInquiryDtos.add(attributeOfInquiryDto);
                }
                inquiryDto.setAttributeOfInquiryDtos(attributeOfInquiryDtos);
            }
            inquiryDtos.add(inquiryDto);
        }
        return inquiryDtos;
    }

    @Override
    @Transactional(readOnly = true)
    public List<InquiryDto> getByName(String name) {
        List<Inquiry> inquiries = inquiryDao.getByName(name);
        List<InquiryDto> inquiryDtos = new ArrayList<>();

        for (Inquiry inquiry : inquiries) {
            InquiryDto inquiryDto = new InquiryDto();

            inquiryDto.setId(Integer.toString(inquiry.getId()));

            TopicDto topicDto = new TopicDto();
            topicDto.setId(Integer.toString(inquiry.getTopic().getId()));
            topicDto.setName(inquiry.getTopic().getName());
            inquiryDto.setTopicDto(topicDto);

            inquiryDto.setCustomerName(inquiry.getCustomerName());
            inquiryDto.setCreateDate(inquiry.getCreateDate());
            inquiryDto.setDescription(inquiry.getDescription());

            if (inquiry.getAttributeOfInquiry() != null) {
                List<AttributeOfInquiryDto> attributeOfInquiryDtos = new ArrayList<>();
                for (AttributeOfInquiry attributeOfInquiry : inquiry.getAttributeOfInquiry()) {
                    AttributeOfInquiryDto attributeOfInquiryDto = new AttributeOfInquiryDto();

                    attributeOfInquiryDto.setId(Integer.toString(attributeOfInquiry.getId()));
                    attributeOfInquiryDto.setName(attributeOfInquiry.getName());
                    attributeOfInquiryDto.setValue(attributeOfInquiry.getValue());

                    attributeOfInquiryDtos.add(attributeOfInquiryDto);
                }
                inquiryDto.setAttributeOfInquiryDtos(attributeOfInquiryDtos);
            }
            inquiryDtos.add(inquiryDto);
        }
        return inquiryDtos;
    }

    @Override
    public void update(InquiryDto inquiryDto) {
        Inquiry inquiry = new Inquiry();
        inquiry.setId(Integer.parseInt(inquiryDto.getId()));

        Topic topic = new Topic();
        topic.setId(Integer.parseInt(inquiryDto.getTopicDto().getId()));
        topic.setName(inquiryDto.getTopicDto().getName());
        inquiry.setTopic(topic);

        inquiry.setCreateDate(inquiryDto.getCreateDate());
        inquiry.setDescription(inquiryDto.getDescription());

        if (inquiryDto.getAttributeOfInquiryDtos() != null) {
            List<AttributeOfInquiry> attributeOfInquiries = new ArrayList<>();
            for (AttributeOfInquiryDto attributeOfInquiryDto : inquiryDto.getAttributeOfInquiryDtos()) {
                AttributeOfInquiry attributeOfInquiry = new AttributeOfInquiry();

                attributeOfInquiry.setId(Integer.parseInt(attributeOfInquiryDto.getId()));
                attributeOfInquiry.setName(attributeOfInquiryDto.getName());
                attributeOfInquiry.setValue(attributeOfInquiryDto.getValue());

                attributeOfInquiries.add(attributeOfInquiry);
            }
            inquiry.setAttributeOfInquiry(attributeOfInquiries);
        }
        inquiryDao.update(inquiry);
    }

    @Override
    public void delete(InquiryDto inquiryDto) {
        Inquiry inquiry = new Inquiry();
        inquiry.setId(Integer.parseInt(inquiryDto.getId()));

        Topic topic = new Topic();
        topic.setId(Integer.parseInt(inquiryDto.getTopicDto().getId()));
        topic.setName(inquiryDto.getTopicDto().getName());
        inquiry.setTopic(topic);

        inquiry.setCreateDate(inquiryDto.getCreateDate());
        inquiry.setDescription(inquiryDto.getDescription());

        if (inquiryDto.getAttributeOfInquiryDtos() != null) {
            List<AttributeOfInquiry> attributeOfInquiries = new ArrayList<>();
            for (AttributeOfInquiryDto attributeOfInquiryDto : inquiryDto.getAttributeOfInquiryDtos()) {
                AttributeOfInquiry attributeOfInquiry = new AttributeOfInquiry();

                attributeOfInquiry.setId(Integer.parseInt(attributeOfInquiryDto.getId()));
                attributeOfInquiry.setName(attributeOfInquiryDto.getName());
                attributeOfInquiry.setValue(attributeOfInquiryDto.getValue());

                attributeOfInquiries.add(attributeOfInquiry);
            }
            inquiry.setAttributeOfInquiry(attributeOfInquiries);
        }
        inquiryDao.delete(inquiry);
    }
}
