package com.piercegroup.options.mappers;

import com.piercegroup.options.dtos.OptionDto;
import com.piercegroup.options.entities.Option;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class OptionMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Option mapToOption(final OptionDto optionDto) {
        return modelMapper.map(optionDto, Option.class);
    }

    public OptionDto mapToOption(final Option option) {
        return modelMapper.map(option, OptionDto.class);
    }
}
