package com.app.phonebook.services;

import com.app.phonebook.models.Sample;
import com.app.phonebook.repositories.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneService extends CrudService<Sample, PhoneRepository> {

    @Autowired
    @Override
    public void setRepo(PhoneRepository repo) {
        this.repo = repo;
    }

    @Override
    public Sample copy(Sample from, Sample to) {
        to = from;
        return to;
    }

}
