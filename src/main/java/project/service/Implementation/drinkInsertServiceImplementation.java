package project.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.service.DrinkInsertService;

import project.persistence.entities.Drink;
import project.persistence.repositories.DrinkRepository;

@Service
public class drinkInsertServiceImplementation implements DrinkInsertService {

    DrinkRepository repository;


    @Autowired
    public DrinkInsertServiceImplementation(DrinkRepository repository) {
        this.repository = repository;
    }

    @Override
    public Drink save(Drink drink) {
        return repository.save(drink);
    }
}
