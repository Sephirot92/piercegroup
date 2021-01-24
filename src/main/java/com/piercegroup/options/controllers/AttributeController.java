package com.piercegroup.options.controllers;

import com.piercegroup.options.dtos.AttributeDto;
import com.piercegroup.options.mappers.AttributeMapper;
import com.piercegroup.options.services.AttributesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/pg")
public class AttributeController {

    private static final Logger logger = LoggerFactory.getLogger(AttributeController.class);

    @Autowired
    private AttributesService attributesService;

    @Autowired
    private AttributeMapper attributeMapper;

    @GetMapping(value = "/getAttributes")
    public List<AttributeDto> getAllAttributes() {
        logger.info("Retrieving all attributes.");
        return attributeMapper.mapToAttributeDtoList(attributesService.getAllAttributes());
    }

    @GetMapping(value = "/attribute{id}")
    private AttributeDto getAttribute(@RequestParam Long id) {
        logger.info("Started getAttribute in AttributeController.");

        return attributeMapper.mapToAttributeDto(attributesService.findById(id));
    }

    @PostMapping(value = "/attribute")
    public void createAttribute(@RequestBody AttributeDto attributeDto) {
        logger.info("Started createAttribute in AttributeController");
        attributesService.createAttribute(attributeMapper.mapToAttribute(attributeDto));
    }

    @PutMapping(value = "/attribute")
    public AttributeDto updateAttribute(@RequestBody AttributeDto attributeDto) {
        logger.info("Started updateAttribute in AttributeController");
        return attributeMapper.mapToAttributeDto(attributesService.updateAttribute(attributeMapper.mapToAttribute(attributeDto)));
    }

    @DeleteMapping(value = "/attribute{id}")
    private void deleteAttribute(@RequestParam Long id) {
        logger.info("Started deleteAttribute in AttributeController.");

        attributesService.deleteAttribute(id);
    }
}
