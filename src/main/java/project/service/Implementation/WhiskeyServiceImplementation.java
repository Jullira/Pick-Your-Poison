package project.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.persistence.entities.Whiskey;
import project.persistence.repositories.WhiskeyRepository;
import project.service.WhiskeyService;

import java.util.Collections;
import java.util.List;

@Service
public class WhiskeyServiceImplementation implements WhiskeyService {

    // Instance Variables
    WhiskeyRepository repository;

    // Dependency Injection
    @Autowired
    public WhiskeyServiceImplementation(WhiskeyRepository repository) {
        this.repository = repository;
    }

    @Override
    public Whiskey save(Whiskey whiskey) {
        return repository.save(whiskey);
    }

    @Override
    public void delete(Whiskey whiskey) {
        repository.delete(whiskey);
    }

    @Override
    public List<Whiskey> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Whiskey> findAllReverseOrder() {
        // get all the whiskey
        List<Whiskey> whiskey = repository.findAll();

        // Reverse the list
        Collections.reverse(whiskey);

        return whiskey;
    }

    @Override
    public Whiskey findOne(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<Whiskey> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Whiskey> findByDescription(String description) {return repository.findByName(description);}

    @Override
    public List<Whiskey> findByAlcohol(String alcohol) {return repository.findByName(alcohol);}


}
