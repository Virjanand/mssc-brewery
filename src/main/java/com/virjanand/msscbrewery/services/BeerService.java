package com.virjanand.msscbrewery.services;

import com.virjanand.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
