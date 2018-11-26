package project.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import project.persistence.entities.Whiskey;

import java.util.List;
@Repository
public interface WhiskeyRepository extends JpaRepository<Whiskey, Long> {
    /**
     * Save Whiskey to the database
     * @param Whiskey to be saved
     * @return the Whiskey that was saved
     */
    Whiskey save(Whiskey Whiskey);

    /**
     * Delete a Whiskey from the datbase
     * @param Whiskey to be deleted
     */
    void delete(Whiskey Whiskey);

    /**
     * Find one Whiskey in the database after id
     * @param id of the Whiskey to be found
     * @return the Whiskey with the given id
     */
    @Query(value = "SELECT r FROM Whiskey r WHERE r.id = ?1")
    Whiskey findOne(Long id);

    /**
     * Search for a Whiskey by price
     * @return a list of Whiskeys that match the query
     */
    List<Whiskey> findByPrice(String price);

    /**
     * Searches for Whiskeys by name
     * @param name to search for
     * @return a list of Whiskey that have a name matching the parameter
     */
    List<Whiskey> findByName(String name);

}
