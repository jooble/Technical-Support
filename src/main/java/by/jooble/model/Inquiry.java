package by.jooble.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * TODO
 */
@Entity
public class Inquiry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(fetch = FetchType.EAGER, targetEntity = Topic.class)
    private Topic topic;

    @OneToMany(fetch = FetchType.EAGER, targetEntity = AttributeOfInquiry.class)
    private List<AttributeOfInquiry> attributeOfInquiry;
    private String description;
    private Date createDate;
    private String customerName;

    public Inquiry() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<AttributeOfInquiry> getAttributeOfInquiry() {
        return attributeOfInquiry;
    }

    public void setAttributeOfInquiry(List<AttributeOfInquiry> attributeOfInquiry) {
        this.attributeOfInquiry = attributeOfInquiry;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
