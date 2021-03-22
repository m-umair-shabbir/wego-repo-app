package com.umair.fortuneservices.service;

import com.umair.fortuneservices.model.Quotes;
import com.umair.fortuneservices.repository.QuotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class QuotesServiceImpl implements QuotesService {

    @Autowired
    QuotesRepository quotesRepository;

    @Override
    public Quotes findById(Long id) {
        Optional<Quotes> optional = quotesRepository.findById(id);
        if (optional.isPresent()) {
            Quotes object = optional.get();
            return object;
        } else {
            return null;
        }
    }
}
