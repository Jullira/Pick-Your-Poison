package project.service;

import project.persistence.entities.Location;
import project.persistence.entities.PostitNote;

import java.util.List;

public interface LocationService {


    static void findAll(Location location) {
    }
    /**
     * Save a {@link Location}
     * @param Location {@link Location} to be saved
     * @return {@link Location} that was saved
     */
    Location save(Location location);

    /**
     * Delete {@link Location}
     * @param Location {@link Location} to be deleted
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
     * Find all {@link Location}s with {@link String name}
     * @param name {@link String}
     * @return All {@link Location}s with the {@link String name} passed
     */
    List<Location> findByName(String name);

    /**
     *  Finda all {@link Location}s with {@link String alcohol}
     * @param alcohol {@link String}
     * @return All {@link Location}s with the {@link String alcohol} passed
     */
    List<Location> findByAlcohol(String alcohol);
}
