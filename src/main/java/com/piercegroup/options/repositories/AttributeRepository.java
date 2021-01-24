package com.piercegroup.options.repositories;


import com.piercegroup.options.entities.Attribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Repository
public interface AttributeRepository extends JpaRepository<Attribute, Long> {

    @Override
    Optional<Attribute> findById(Long id);

}
