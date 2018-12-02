package project.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.persistence.entities.Offer;
import project.persistence.repositories.OfferRepository;
import project.service.OfferService;
import java.util.List;


@Service
public class OfferServiceImplementation implements OfferService {

    private OfferRepository repository;

    @Autowired
    public OfferServiceImplementation(OfferRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Offer> findAll() {
        return repository.findAll();
    }


    /**
     * impliment  service method and call upon Repository
     * @param name sent into Repository
     * */
    @Override
    public List<Offer> findAllByNameLike(String name) {
        return repository.findAllByNameLike(name);
    }


}