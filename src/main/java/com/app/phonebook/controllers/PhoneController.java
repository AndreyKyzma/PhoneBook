package com.app.phonebook.controllers;

import com.app.phonebook.models.PhoneBookRecord;
import com.app.phonebook.models.User;
import com.app.phonebook.repositories.PhoneRepository;
import com.app.phonebook.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/phonebook")
public class PhoneController {

    @Autowired
    private PhoneRepository phoneRepository;

    @Autowired
    private PhoneService service;

    @RequestMapping("/listrecord")
    public String getListRecord(ModelMap map) {
        Iterable<PhoneBookRecord> records = this.phoneRepository.findAll();
        map.addAttribute("records", records);
        return "/phonebook/listrecord";
    }

    @RequestMapping(value = "/addrecord", method = RequestMethod.GET)
    public String getRecord(ModelMap map, HttpSession session) {
        map.put("phonebook", new PhoneBookRecord());

        return "/phonebook/edit";
    }


    @RequestMapping(value = "addrecord", method = RequestMethod.POST)
    public String addRecord(HttpSession session, @Valid PhoneBookRecord record) {
        record.setHomePhone(record.getHomePhone());
        record.setLastName(record.getLastName());
        record.setFirstName(record.getFirstName());
        record.setMobilePhone(record.getMobilePhone());
        record.setAddress(record.getAddress());
        record.setEmail(record.getEmail());
        record.setMiddleName(record.getMiddleName());

        service.addRecord(record);
        return "/phonebook/listrecord";
    }

    @RequestMapping("/delete")
    public String delete(Long id) {
        service.delete(id);
        return "redirect:/phonebook/listrecord";
    }

}
