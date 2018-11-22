package project.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.persistence.entities.Location;
import project.persistence.entities.Whiskey;
import project.persistence.repositories.LocationRepository;
import project.persistence.repositories.WhiskeyRepository;
import project.service.LocationService;
import project.service.WhiskeyService;

import java.util.Collections;
import java.util.List;

@Service
public class LocationServiceImplimentation implements LocationService {
    // Instance Variables
    LocationRepository repository;

    // Dependency Injection
    @Autowired
    public LocationServiceImplimentation(LocationRepository repository) {
        this.repository = repository;
    }

    @Override
    public Location save(Location Location) {
        return repository.save(Location);
    }

    @Override
    public void delete(Location Location) {
        repository.delete(Location);
    }

    @Override
    public List<Location> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Location> findAllReverseOrder() {
        // Get all the Postit notes
        List<Location> postitNotes = repository.findAll();

        // Reverse the list
        Collections.reverse(postitNotes);

        return postitNotes;
    }

    @Override
    public Location findOne(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<Location> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Location> findByAlcohol(String alcohol) {
        return null;
    }
}
