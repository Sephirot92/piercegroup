package com.piercegroup.options.repositories;

import com.piercegroup.options.entities.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface OptionRepository extends JpaRepository<Option, Long> {
}
