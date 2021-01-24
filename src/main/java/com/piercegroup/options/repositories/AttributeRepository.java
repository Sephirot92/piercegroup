package com.piercegroup.options.repositories;


import com.piercegroup.options.entities.Attribute;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AttributeRepository extends JpaRepository<Attribute, String> {

    @Override
    List<Attribute> findAll();

    @Override
    Optional<Attribute> findById(String s);
}
