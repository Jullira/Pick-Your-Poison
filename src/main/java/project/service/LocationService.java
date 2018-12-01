package project.service;

import project.persistence.entities.Location;

import java.util.List;

public interface LocationService {

    /**
     * Save a {@link Location}
     * @param location {@link Location} to be saved
     * @return {@link Location} that was saved
     */
    Location save(Location location);

    /**
     * Delete {@link Location}
     * @param location {@link Location} to be deleted
     */
    void delete(Location location);

    /**
     * Get all {@link Location}s
     * @return A list of {@link Location}s
     */
    List<Location> findAll();

    /**
     * Get all {@link Location}s in a reverse order
     * @return A reversed list of {@link Location}s
     */
    List<Location> findAllReverseOrder();

    /**
     * Find a {@link Location} based on {@link Long id}
     * @param id {@link Long}
     * @return A {@link Location} with {@link Long id}
     */
    Location findOne(Long id);


    /**
     * Searches for Location matching the properties of the given Location
     *
     * @param location that contains the search properties
     * @return a list of Location object that match the search criteria
     */
    List<Location> search(Location location);
    /**
     * Searches for location by name
     * @param location to search for
     * @return a list of location objects that have a name that match the name param
     */
    List<Location> searchLocationByName(Location location);

    /**
     *  Finda all {@link Location}s with {@link String alcohol}
     * @param alcohol {@link String}
     * @return All {@link Location}s with the {@link String alcohol} passed
     */
    List<Location> findByAlcohol(String alcohol);

}
