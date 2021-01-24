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

    public List<Attribute> getAllAttributes() {
        return attributesRepository.findAll();
    }

    public Attribute findById(Long id) {
        return attributesRepository.findById(id).orElseThrow();
    }

    public Attribute createAttribute(Attribute attribute) {
        Optional<Attribute> attributeOptional = attributesRepository.findById(attribute.getId());
        if (!attributeOptional.isPresent())
            return attributesRepository.save(attribute);

        return attribute;
    }

    public Attribute updateAttribute(Attribute attribute) {
        Optional<Attribute> attributeOptional = attributesRepository.findById(attribute.getId());
        if (!attributeOptional.isPresent())
            return attributesRepository.save(attribute);

        return attribute;
    }

    public void deleteAttribute(Long id) {
        Attribute attributeToDelete = attributesRepository.findById(id).orElseThrow();
        attributesRepository.delete(attributeToDelete);
    }
}
