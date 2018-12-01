package project.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import project.persistence.entities.Location;

import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
    /**
     * Save Location to the database
     * @param Location to be saved
     * @return the Location that was saved
     */
    Location save(Location Location);

    /**
     * Delete a Location from the datbase
     * @param Location to be deleted
     */
    void delete(Location Location);

    /**
     * Find one Location in the database after id
     * @param id of the Location to be found
     * @return the Location with the given id
     */
    @Query(value = "SELECT r FROM Location r WHERE r.id = ?1")
    Location findOne(Long id);

    /**
     * Searches for Locations by name
     * @param name to search for
     * @return a list of Location that have a name matching the parameter
     */
    List<Location> findByName(String name);
}