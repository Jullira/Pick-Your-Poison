package project.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.persistence.entities.Drink;
import project.persistence.repositories.DrinkRepository;
import project.service.DrinkService;
import java.util.List;

@Service
public class DrinkServiceImplimentation implements DrinkService{

    private DrinkRepository repository;

    @Autowired
    public DrinkServiceImplimentation(DrinkRepository repository) {
        this.repository = repository;
    }

    @Override
    public Drink save(Drink drink) {
        return null;
    }

    @Override
    public void delete(Drink drink) {

    }

    @Override
    public List<Drink> findAll() {
        return null;
    }

    @Override
    public List<Drink> findAllReverseOrder() {
        return null;
    }

    @Override
    public Drink findOne(Long id) {
        return null;
    }

    @Override
    public List<Drink> search(Drink drink) {
        return null;
    }

    @Override
    public List<Drink> searchDrinkByName(Drink drink) {
        return repository.findByName(drink.getName());
    }

    @Override
    public List<Drink> findByAlcohol(String alcohol) {
        return null;
    }


}
