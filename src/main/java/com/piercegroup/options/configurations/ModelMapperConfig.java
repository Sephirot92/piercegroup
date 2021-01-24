package com.piercegroup.options.configurations;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Class responsible for defining ModelMapper bean. Used for easy object mapping.
 *
 * @version 0.0.1
 *
 * @author Łukasz Czapraga
 */
@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
