package by.jooble.controller;

import by.jooble.model.AttributeOfInquiry;
import by.jooble.model.Inquiry;
import by.jooble.model.Topic;
import by.jooble.service.AttributeOfInquiryService;
import by.jooble.service.InquiryService;
import by.jooble.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping
public class InquiryController {
    @Autowired
    private TopicService topicService;

    @Autowired
    private AttributeOfInquiryService attributeOfInquiryService;

    @Autowired
    private InquiryService inquiryService;


    @RequestMapping(value = "/topics", method = RequestMethod.GET)
    @ResponseBody
    public List<Topic> allTopics() {
        return topicService.getAll();
    }

    @RequestMapping(value = "/customers/{customerName}/inquiries", method = RequestMethod.GET)
    @ResponseBody
    public List<Inquiry> allInquiriesOfCustomer(@PathVariable("customerName") String customerName) {
        return inquiryService.getByName(customerName);
    }
}