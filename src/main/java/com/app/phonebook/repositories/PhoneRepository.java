package com.app.phonebook.repositories;

import com.app.phonebook.models.Sample;
import org.springframework.data.repository.CrudRepository;

public interface PhoneRepository extends CrudRepository<Sample, Long> {

}
