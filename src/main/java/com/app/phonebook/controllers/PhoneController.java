package com.app.phonebook.controllers;

import com.app.phonebook.models.Sample;
import com.app.phonebook.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class PhoneController extends CrudController<Sample, PhoneService> {

    @Autowired
    @Override
    public void setService(PhoneService service) {
        this.service = service;
    }

    @Override
    public Boolean isAuthorized(Long entityId, PhoneService service) {
        return true;
    }


}
