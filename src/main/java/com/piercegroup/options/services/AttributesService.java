package com.piercegroup.options.services;

import com.piercegroup.options.entities.Attribute;
import com.piercegroup.options.repositories.AttributeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttributesService {

    @Autowired
    private AttributeRepository attributesRepository;

    public List<Attribute> getAllAttributes (){
        return attributesRepository.findAll();
    }

    public Optional<Attribute> findByCode (String code){
        return attributesRepository.findById(code);
    }


}
