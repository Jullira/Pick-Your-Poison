package project.service;

import project.persistence.entities.Offer;

import java.util.List;

public interface OfferService {

  
  // List<Offer> searchOfferByName(Offer offer);

  // Optional<Offer> searchOfferById(Offer Offer);

//   List<Offer> searchOfferByName(String name);

   List<Offer> findAll();

   /**
    * Find all {@link Offer}s with {@link String name}
    * @param name {@link String}
    * @return All {@link Offer}s with the {@link String name} passed
    */
   List<Offer> findAllByNameLike(String name);

}
