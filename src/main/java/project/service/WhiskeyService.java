package project.service;

import project.persistence.entities.Whiskey;

import java.util.List;

public interface WhiskeyService {

    /**
     * Save a {@link Whiskey}
     * @param whiskey {@link Whiskey} to be saved
     * @return {@link Whiskey} that was saved
     */
    Whiskey save(Whiskey whiskey);

    /**
     * Delete {@link Whiskey}
     * @param whiskey {@link Whiskey} to be deleted
     */
    void delete(Whiskey whiskey);

    /**
     * Get all {@link Whiskey}s
     * @return A list of {@link Whiskey}s
     */
    List<Whiskey> findAll();

    /**
     * Get all {@link Whiskey}s in a reverse order
     * @return A reversed list of {@link Whiskey}s
     */
    List<Whiskey> findAllReverseOrder();

    /**
     * Find a {@link Whiskey} based on {@link Long id}
     * @param id {@link Long}
     * @return A {@link Whiskey} with {@link Long id}
     */
    Whiskey findOne(Long id);

    /**
     * Find all {@link Whiskey}s with {@link String name}
     * @param whiskey {@link String}
     * @return All {@link Whiskey}s with the {@link String name} passed
     */
    List<Whiskey> searchWhiskeyByName(Whiskey whiskey);

    /**
     *  Finda all {@link Whiskey}s with {@link String alcohol}
     * @param alcohol {@link String}
     * @return All {@link Whiskey}s with the {@link String alcohol} passed
     */
    List<Whiskey> findByAlcohol(String alcohol);

}
