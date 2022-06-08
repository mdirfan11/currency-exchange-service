package com.mdtech.microservices.services;

import com.mdtech.microservices.entity.ExchangeValue;
import com.mdtech.microservices.repository.ExchangeValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExchangeValueServices {

    @Autowired
    private ExchangeValueRepository exchangeValueRepository;

    public ExchangeValue getExchangeValueFromAndTo(String from, String to) {
        return exchangeValueRepository.findByFromAndTo(from, to);
    }
}
