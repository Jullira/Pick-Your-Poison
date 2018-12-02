package project.service;

import org.springframework.stereotype.Service;
import project.persistence.entities.Drink;
import project.persistence.entities.Offer;
import project.persistence.entities.PostitNote;

import java.util.List;
import java.util.Optional;

@Service
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
