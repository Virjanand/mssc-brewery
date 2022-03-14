package com.virjanand.msscbrewery.services;

import com.virjanand.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomer(UUID customerId);
}
