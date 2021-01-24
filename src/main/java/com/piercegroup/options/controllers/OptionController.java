package com.piercegroup.options.controllers;

import com.piercegroup.options.dtos.OptionDto;
import com.piercegroup.options.mappers.OptionMapper;
import com.piercegroup.options.services.OptionsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/pg")
public class OptionController {

    private static final Logger logger = LoggerFactory.getLogger(OptionController.class);

    @Autowired
    private OptionsService optionsService;

    @Autowired
    private OptionMapper optionMapper;

    @GetMapping(value = "/getOptions")
    public List<OptionDto> getAllOptions() {
        logger.info("Retrieving all options.");
        return optionMapper.mapToOptionDtoList(optionsService.getAllOptions());
    }

    @GetMapping(value = "/option{id}")
    private OptionDto getOption(@RequestParam Long id) {
        logger.info("Started getOption in OptionController.");

        return optionMapper.mapToOptionDto(optionsService.findById(id));
    }

    @PostMapping(value = "/option")
    public void createOption(@RequestBody OptionDto optionDto) {
        logger.info("Started createOption in OptionController");
        optionsService.createOption(optionMapper.mapToOption(optionDto));
    }

    @PutMapping(value = "/option")
    public OptionDto updateOption(@RequestBody OptionDto optionDto) {
        logger.info("Started updateOption in OptionController");
        return optionMapper.mapToOptionDto(optionsService.updateOption(optionMapper.mapToOption(optionDto)));
    }

    @DeleteMapping(value = "/option{id}")
    private void deleteOption(@RequestParam Long id) {
        logger.info("Started deleteOption in OptionController.");

        optionsService.deleteOption(id);
    }

}
