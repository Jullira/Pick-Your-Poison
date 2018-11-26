package project.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.persistence.entities.Whiskey;
import project.persistence.repositories.WhiskeyRepository;
import project.service.WhiskeyService;
import java.util.List;

@Service
public class WhiskeyServiceImplimentation implements WhiskeyService{

    private WhiskeyRepository repository;

    @Autowired
    public WhiskeyServiceImplimentation(WhiskeyRepository repository) {
        this.repository = repository;
    }

    @Override
    public Whiskey save(Whiskey whiskey) {
        return null;
    }

    @Override
    public void delete(Whiskey whiskey) {

    }

    @Override
    public List<Whiskey> findAll() {
        return null;
    }

    @Override
    public List<Whiskey> findAllReverseOrder() {
        return null;
    }

    @Override
    public Whiskey findOne(Long id) {
        return null;
    }

    @Override
    public List<Whiskey> searchWhiskeyByName(Whiskey whiskey) {
        return repository.findByName(whiskey.getName());
    }

    @Override
    public List<Whiskey> findByAlcohol(String alcohol) {
        return null;
    }
}
