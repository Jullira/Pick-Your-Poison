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

    /**
     * Call all
     */
   List<Offer> findAll();

    /**
     * Searches for Offers by name
     *
     * @param name to search for
     * @return a list of Offer that have a name matching the parameter
     */
    @Query(value = "SELECT o FROM Offer o where o.name LIKE %?1%")
    List<Offer> findAllByNameLike(String name);

}
