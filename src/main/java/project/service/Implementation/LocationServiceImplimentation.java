package project.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.persistence.entities.Location;
import project.persistence.repositories.LocationRepository;
import project.service.LocationService;

import java.util.List;

@Service
public class LocationServiceImplimentation implements LocationService{

    private LocationRepository repository;

    @Autowired
    public LocationServiceImplimentation(LocationRepository repository) {
        this.repository = repository;
    }

    @Override
    public Location save(Location location) {
        return null;
    }

    @Override
    public void delete(Location location) {

    }

    @Override
    public List<Location> findAll() {
        return null;
    }

    @Override
    public List<Location> findAllReverseOrder() {
        return null;
    }

    @Override
    public Location findOne(Long id) {
        return null;
    }

    @Override
    public List<Location> search(Location location) {
        return null;
    }

    @Override
    public List<Location> searchLocationByName(Location location) {
        return repository.findByName(location.getName());
    }

    @Override
    public List<Location> findByAlcohol(String alcohol) {
        return null;
    }


}
