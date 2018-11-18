package project.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import project.persistence.entities.PostitNote;
import project.persistence.entities.Whiskey;

import java.util.List;*/
public interface WhiskeyRepository extends JpaRepository<Whiskey, Long> {

    Whiskey save(Whiskey whiskey);

    void delete(Whiskey whiskey);

    List<Whiskey> findAll();

    // If we need a custom query that maybe doesn't fit the naming convention used by the JPA repository,
    // then we can write it quite easily with the @Query notation, like you see below.
    // This method returns all PostitNotes where the length of the name is equal or greater than 3 characters.
    @Query(value = "SELECT p FROM Whiskey p where length(p.name) >= 3 ")
    List<Whiskey> findAllWithNameLongerThan3Chars();

    // Instead of the method findAllReverseOrder() in PostitNoteService.java,
    // We could have used this method by adding the words
    // ByOrderByIdDesc, which mean: Order By Id in a Descending order
    //
    List<Whiskey> findAllByOrderByIdDesc();

    @Query(value = "SELECT p FROM Whiskey p WHERE p.id = ?1")
    Whiskey findOne(Long id);

    List<Whiskey> findByName(String name);
}
