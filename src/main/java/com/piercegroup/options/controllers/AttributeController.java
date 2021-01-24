package com.piercegroup.options.controllers;

import com.piercegroup.options.entities.Attribute;
import com.piercegroup.options.services.AttributesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/v1")
public class AttributeController {

    private static final Logger logger = LoggerFactory.getLogger(AttributeController.class);

    @Autowired
    AttributesService attributesService;

    @GetMapping(value = "getAttributes")
    public List<Attribute> getAttributes() {
        return new ArrayList<>();
    }
}
