package project.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.persistence.entities.Drink;
import project.persistence.entities.Offer;
import project.persistence.repositories.OfferRepository;
import project.service.OfferService;
import java.util.List;
import java.util.Optional;

@Service
public class OfferServiceImplementation implements OfferService {

    private OfferRepository repository;

    @Autowired
    public OfferServiceImplementation(OfferRepository repository) {
        this.repository = repository;
    }

   // @Override
   // public Optional<Offer> searchOfferById(Offer Offer) {
   //     return repository.findById(Offer.getId());
   // }
/*
    @Override
    public List<Offer> searchOfferByName(String name) {
        return repository.findByName(name);
    }
*/
    @Override
    public List<Offer> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Offer> findAllByNameLike(String name) {
        return repository.findAllByNameLike(name);
    }


}