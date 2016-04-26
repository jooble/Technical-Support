package by.jooble.controller;

import by.jooble.dto.InquiryDto;
import by.jooble.dto.TopicDto;
import by.jooble.model.DataSourceDataTable;
import by.jooble.service.AttributeOfInquiryService;
import by.jooble.service.InquiryService;
import by.jooble.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * TODO
 */
@Controller
@RequestMapping
public class OperatorController {
    @Autowired
    private TopicService topicService;

    @Autowired
    private AttributeOfInquiryService attributeOfInquiryService;

    @Autowired
    private InquiryService inquiryService;


    @RequestMapping(value = "/topics/json", method = RequestMethod.GET)
    @ResponseBody
    public DataSourceDataTable getAllTopicsJson() {
        List<TopicDto> list = topicService.getAll();

        DataSourceDataTable dataSourceDatatables = new DataSourceDataTable();

        dataSourceDatatables.setData(list);
        dataSourceDatatables.setRecordsFiltered(list.size());
        dataSourceDatatables.setRecordsTotal(list.size());
        dataSourceDatatables.setDraw(1);

        return dataSourceDatatables;
    }

    @RequestMapping(value = "/topics", method = RequestMethod.GET)
    public String openPageAllTopics() {
        return "allTopics";
    }

    @RequestMapping(value = "/customers/{customerName}/inquiries", method = RequestMethod.GET)
    @ResponseBody
    public List<InquiryDto> getAllInquiriesOfCustomer(@PathVariable("customerName") String customerName) {
        return inquiryService.getByName(customerName);
    }

    @RequestMapping(value = "/customers/{customerName}/inquiries/{inquiryId}", method = RequestMethod.GET)
    @ResponseBody
    public InquiryDto getInquiryByNameAndId(@PathVariable("inquiryId") int inquiryId) {
        return inquiryService.getById(inquiryId);
    }

    @RequestMapping(value = "/customers/{customerName}/inquiries", method = RequestMethod.POST)
    @ResponseBody
    public void insertInquiry(@RequestBody InquiryDto inquiryDto) {
        inquiryService.insert(inquiryDto);
    }

    @RequestMapping(value = "/customers/{customerName}/inquiries/{inquiryId}", method = RequestMethod.PUT)
    @ResponseBody
    public void updateInquiry(@RequestBody InquiryDto inquiryDto) {
        inquiryService.update(inquiryDto);
    }

    @RequestMapping(value = "/customers/{customerName}/inquiries/{inquiryId}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteInquiry(@RequestBody InquiryDto inquiryDto) {
        inquiryService.delete(inquiryDto);
    }
}