package com.app.phonebook.services;

import com.app.phonebook.models.PhoneBookRecord;
import com.app.phonebook.repositories.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public PhoneBookRecord addRecord(PhoneBookRecord phoneBookRecord){
        PhoneBookRecord record = repo.save(phoneBookRecord);
        return record;
    }


    public PhoneBookRecord editRecord(PhoneBookRecord phoneBookRecord){
        PhoneBookRecord record = this.repo.findOne(phoneBookRecord.getId());
        record = copy(phoneBookRecord, record);
         return this.repo.save(phoneBookRecord);
    }

    public Boolean delete(Long id) {
        this.repo.delete(id);
        return true;
    }


}
