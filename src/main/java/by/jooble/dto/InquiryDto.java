package by.jooble.dto;

import java.util.Date;
import java.util.List;

/**
 * TODO
 */
public class InquiryDto {
    private String id;
    private TopicDto topicDto;
    private List<AttributeOfInquiryDto> attributeOfInquiryDtos;
    private String description;
    private Date createDate;
    private String customerName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<AttributeOfInquiryDto> getAttributeOfInquiryDtos() {
        return attributeOfInquiryDtos;
    }

    public void setAttributeOfInquiryDtos(List<AttributeOfInquiryDto> attributeOfInquiryDtos) {
        this.attributeOfInquiryDtos = attributeOfInquiryDtos;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public TopicDto getTopicDto() {
        return topicDto;
    }

    public void setTopicDto(TopicDto topicDto) {
        this.topicDto = topicDto;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
