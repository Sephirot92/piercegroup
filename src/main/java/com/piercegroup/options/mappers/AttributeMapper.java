package com.piercegroup.options.mappers;

import com.piercegroup.options.dtos.AttributeDto;
import com.piercegroup.options.entities.Attribute;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AttributeMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Attribute mapToAttribute(final AttributeDto attributeDto) {
        return modelMapper.map(attributeDto, Attribute.class);
    }

    public AttributeDto mapToAttributeDto(final Attribute attribute) {
        return modelMapper.map(attribute, AttributeDto.class);
    }
}
