package com.app.phonebook.repositories;

import com.app.phonebook.models.PhoneBookRecord;
import org.springframework.data.repository.CrudRepository;

public interface PhoneRepository extends CrudRepository<PhoneBookRecord, Long> {

}
