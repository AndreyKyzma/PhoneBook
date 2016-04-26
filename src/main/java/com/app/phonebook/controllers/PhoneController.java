package com.app.phonebook.controllers;

import com.app.phonebook.models.PhoneBookRecord;
import com.app.phonebook.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/phonebook")
public class PhoneController extends CrudController<PhoneBookRecord, PhoneService> {

    @Autowired
    @Override
    public void setService(PhoneService service) {
        this.service = service;
    }

    @Override
    public Boolean isAuthorized(Long entityId, PhoneService service) {
        return true;
    }



//    @RequestMapping(value = "/add/contacts", method = RequestMethod.POST)
//    public String addNewContact(@RequestParam String firstName,
//                                @RequestParam String middleName,
//                                @RequestParam String lastName,
//                                @RequestParam String mobilePhone,
//                                @RequestParam String homePhone,
//                                @RequestParam String address,
//                                @RequestParam String email,
//                                HttpSession session,
//                                RedirectAttributes attributes)

}
