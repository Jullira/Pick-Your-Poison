package project.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.persistence.entities.Offer;
import project.persistence.repositories.OfferRepository;
import project.service.OfferService;

import java.util.Collections;
import java.util.List;

@Service
public class OfferServiceImplementation implements OfferService {

    // Instance Variables
    OfferRepository repository;

    // Dependency Injection
    @Autowired
    public OfferServiceImplementation(OfferRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Offer> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Offer> findAllByNameLike(String name) {
        return repository.findAllByNameLike(name);
    }
}
