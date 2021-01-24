package com.piercegroup.options.mappers;

import com.piercegroup.options.dtos.OptionDto;
import com.piercegroup.options.entities.Option;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OptionMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Option mapToOption(final OptionDto optionDto) {
        return modelMapper.map(optionDto, Option.class);
    }

    public OptionDto mapToOptionDto(final Option option) {
        return modelMapper.map(option, OptionDto.class);
    }

    public List<Option> mapToOptionList(final List<OptionDto> optionDtoList) {
        return optionDtoList.stream()
                .map(this::mapToOption)
                .collect(Collectors.toList());
    }

    public List<OptionDto> mapToOptionDtoList(final List<Option> optionList) {
        return optionList.stream()
                .map(this::mapToOptionDto)
                .collect(Collectors.toList());
    }
}
