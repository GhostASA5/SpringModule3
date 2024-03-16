package com.example.SpringModul3.repository;

import com.example.SpringModul3.domain.Contact;

import java.util.List;
import java.util.Optional;

public interface ContactsRepository {

    List<Contact> findAll();

    Optional<Contact> findById(Long id);

    Contact save(Contact task);

    Contact update(Contact task);
    void deleteById(Long id);
}
