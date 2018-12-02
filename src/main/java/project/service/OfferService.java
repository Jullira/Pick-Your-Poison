package project.service;

import org.springframework.stereotype.Service;
import project.persistence.entities.Offer;
import java.util.List;


@Service
public interface OfferService {

   /**
    * Find all {@link Offer}s with {@link String name}
    * @return All {@link Offer}s
    */
   List<Offer> findAll();

   /**
    * Find all by name with {@link String name}
    * @return All {@link Offer}s
    */
   List<Offer> findAllByNameLike(String name);


}
