package com.piercegroup.options.repositories;


import com.piercegroup.options.entities.Attribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface AttributeRepository extends JpaRepository<Attribute, Long> {

}
