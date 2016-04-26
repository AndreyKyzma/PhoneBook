package com.app.phonebook.services;

import com.app.phonebook.models.PhoneBookRecord;
import com.app.phonebook.repositories.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneService extends CrudService<PhoneBookRecord, PhoneRepository> {

    @Autowired
    @Override
    public void setRepo(PhoneRepository repo) {
        this.repo = repo;
    }

    @Override
    public PhoneBookRecord copy(PhoneBookRecord from, PhoneBookRecord to) {
        to = from;
        return to;
    }

}
