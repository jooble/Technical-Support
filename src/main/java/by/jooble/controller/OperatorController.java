package by.jooble.controller;

import by.jooble.model.Inquiry;
import by.jooble.model.Topic;
import by.jooble.service.AttributeOfInquiryService;
import by.jooble.service.InquiryService;
import by.jooble.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class OperatorController {
    @Autowired
    private TopicService topicService;

    @Autowired
    private AttributeOfInquiryService attributeOfInquiryService;

    @Autowired
    private InquiryService inquiryService;


    @RequestMapping(value = "/topics", method = RequestMethod.GET)
    @ResponseBody
    public List<Topic> getAllTopics() {
        return topicService.getAll();
    }

    @RequestMapping(value = "/customers/{customerName}/inquiries", method = RequestMethod.GET)
    @ResponseBody
    public List<Inquiry> getAllInquiriesOfCustomer(@PathVariable("customerName") String customerName) {
        return inquiryService.getByName(customerName);
    }

    @RequestMapping(value = "/customers/{customerName}/inquiries/{inquiryId}", method = RequestMethod.GET)
    @ResponseBody
    public Inquiry getInquiryByNameAndId(@PathVariable("inquiryId") int inquiryId) {
        return inquiryService.getById(inquiryId);
    }

    @RequestMapping(value = "/customers/{customerName}/inquiries", method = RequestMethod.POST)
    @ResponseBody
    public void insertInquiry(@RequestBody Inquiry inquiry) {
        inquiryService.insert(inquiry);
    }

    @RequestMapping(value = "/customers/{customerName}/inquiries/{inquiryId}", method = RequestMethod.PUT)
    @ResponseBody
    public void updateInquiry(@RequestBody Inquiry inquiry) {
        inquiryService.update(inquiry);
    }

    @RequestMapping(value = "/customers/{customerName}/inquiries/{inquiryId}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteInquiry(@RequestBody Inquiry inquiry) {
        inquiryService.delete(inquiry);
    }
}