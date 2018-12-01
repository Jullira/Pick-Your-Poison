package project.service;

import project.persistence.entities.Drink;

import java.util.List;

public interface DrinkService {

    /**
     * Save a {@link Drink}
     * @param drink {@link Drink} to be saved
     * @return {@link Drink} that was saved
     */
    Drink save(Drink drink);

    /**
     * Delete {@link Drink}
     * @param drink {@link Drink} to be deleted
     */
    void delete(Drink drink);

    /**
     * Get all {@link Drink}s
     * @return A list of {@link Drink}s
     */
    List<Drink> findAll();

    /**
     * Get all {@link Drink}s in a reverse order
     * @return A reversed list of {@link Drink}s
     */
    List<Drink> findAllReverseOrder();

    /**
     * Find a {@link Drink} based on {@link Long id}
     * @param id {@link Long}
     * @return A {@link Drink} with {@link Long id}
     */
    Drink findOne(Long id);

    /**
     * Searches for Drink matching the properties of the given Drink
     *
     * @param drink that contains the search properties
     * @return a list of Drink object that match the search criteria
     */
    List<Drink> search(Drink drink);
    /**
     * Searches for Drink by name
     * @param drink to search for
     * @return a list of Drink objects that have a name that match the name param
     */
    List<Drink> searchDrinkByName(Drink drink);

    /**
     *  Finda all {@link Drink}s with {@link String alcohol}
     * @param alcohol {@link String}
     * @return All {@link Drink}s with the {@link String alcohol} passed
     */
    List<Drink> findByAlcohol(String alcohol);

}
