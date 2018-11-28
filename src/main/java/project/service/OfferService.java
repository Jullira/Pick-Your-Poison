package project.service;

import project.persistence.entities.Offer;

import java.util.List;

public interface OfferService {


    /**
     * Get all {@link Offer}s
     * @return A list of {@link Offer}s
     */
    List<Offer> findAll();

}
