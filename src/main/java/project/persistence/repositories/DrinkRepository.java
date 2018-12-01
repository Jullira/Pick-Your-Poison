package project.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import project.persistence.entities.Drink;

import java.util.List;
@Repository
public interface DrinkRepository extends JpaRepository<Drink, Long> {
    /**
     * Save Drink to the database
     * @param drink to be saved
     * @return the Drink that was saved
     */
    Drink save(Drink drink);

    /**
     * Delete a Drink from the datbase
     * @param drink to be deleted
     */
    void delete(Drink drink);

    /**
     * Find one Drink in the database after id
     * @param id of the Drink to be found
     * @return the Drink with the given id
     */
    @Query(value = "SELECT r FROM Drink r WHERE r.id = ?1")
    Drink findOne(Long id);

    /**
     * Search for a Drink by price
     * @return a list of Drinks that match the query
     */
//    List<Drink> findByPrice(String price);

    /**
     * Searches for Drinks by name
     * @param name to search for
     * @return a list of Drink that have a name matching the parameter
     */
    List<Drink> findByName(String name);



}