package project.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import project.persistence.entities.Location;
import project.persistence.entities.Whiskey;

import java.util.List;

public interface LocationRepository  extends JpaRepository<Location, Long> {
    Location save(Location location);

    void delete(Location location);

    List<Location> findAll();

    // If we need a custom query that maybe doesn't fit the naming convention used by the JPA repository,
    // then we can write it quite easily with the @Query notation, like you see below.
    // This method returns all PostitNotes where the length of the name is equal or greater than 3 characters.
    @Query(value = "SELECT p FROM Location p where length(p.name) >= 3 ")
    List<Location> findAllWithNameLongerThan3Chars();

    // Instead of the method findAllReverseOrder() in PostitNoteService.java,
    // We could have used this method by adding the words
    // ByOrderByIdDesc, which mean: Order By Id in a Descending order
    //
    List<Location> findAllByOrderByIdDesc();

    @Query(value = "SELECT p FROM Location p WHERE p.id = ?1")
    Location findOne(Long id);

    List<Location> findByName(String name);

}
