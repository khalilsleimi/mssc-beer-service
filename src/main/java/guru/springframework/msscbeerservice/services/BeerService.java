package guru.springframework.msscbeerservice.services;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

public interface BeerService {
    public BeerDto getById(UUID beerId);

    public BeerDto saveNewBeer(BeerDto beerDto);

    public BeerDto updateBeer(UUID beerId, BeerDto beerDto);
}
