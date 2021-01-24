package com.piercegroup.options.services;

import com.piercegroup.options.entities.Option;
import com.piercegroup.options.repositories.OptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OptionsService {

    @Autowired
    OptionRepository optionRepository;

    public List<Option> getAllOptions() {
        return optionRepository.findAll();
    }

    public Option findById(Long id) {
        return optionRepository.findById(id).orElseThrow();
    }

    public Option createOption(Option option) {
        Optional<Option> optionOptional = optionRepository.findById(option.getId());
        if (!optionOptional.isPresent())
            return optionRepository.save(option);

        return option;
    }

    public Option updateOption(Option option) {
        Optional<Option> optionOptional = optionRepository.findById(option.getId());
        if (!optionOptional.isPresent())
            return optionRepository.save(option);

        return option;
    }

    public void deleteOption(Long id) {
        Option optionToDelete = optionRepository.findById(id).orElseThrow();
        optionRepository.delete(optionToDelete);
    }
}
