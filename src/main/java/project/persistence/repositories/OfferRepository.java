package project.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import project.persistence.entities.Drink;
import project.persistence.entities.Offer;
import java.util.List;


public interface OfferRepository  extends JpaRepository<Offer, Long> {

    /**
     * Save Offer to the database
     *
     * @param Offer to be saved
     * @return the Offer that was saved
     */
    Offer save(Offer Offer);

    /**
     * Delete a Offer from the datbase
     *
     * @param Offer to be deleted
     */
    void delete(Offer Offer);


    List<Offer> findAll();

    /**
     * Find one Offer in the database after id
     *
     * @param id of the Offer to be found
     * @return the Offer with the given id
     */
    /*@Query(value = "SELECT r FROM Offer r WHERE r.id = ?1")
    Offer findOne(Long id);*/

    /**
     * Search for a Offer by price
     *
     * @return a list of Offers that match the query
     */
    /*List<Offer> findByPrice(String price);*/

    /**
     * Searches for Offers by name
     *
     * @param name to search for
     * @return a list of Offer that have a name matching the parameter
     */
    /*@Query(value = "SELECT price FROM offers")
    List<Offer> findByName(String name);*/

    /**
     * Searches for Offers by name
     *
     * @param name to search for
     * @return a list of Offer that have a name matching the parameter
     */
    List<Offer> findByName(String name1);

}
