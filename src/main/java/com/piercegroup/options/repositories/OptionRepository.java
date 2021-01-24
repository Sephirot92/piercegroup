package com.piercegroup.options.repositories;

import com.piercegroup.options.entities.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Repository
public interface OptionRepository extends JpaRepository<Option, Long> {

    @Override
    Optional<Option> findById(Long id);
}
