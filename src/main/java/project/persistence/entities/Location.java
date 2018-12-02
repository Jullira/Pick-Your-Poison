package project.persistence.entities;

import javax.persistence.*;
import java.util.List;

/**
 * The class for the Postit Note itself.
 * The system generates a table schema based on this class for this entity.
 * Be sure to annotate any entities you have with the @Entity annotation.
 */
@Entity
@Table(name = "locations") // If you want to specify a table name, you can do so here
public class Location {

    // Declare that this attribute is the id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;

    @OneToMany (mappedBy = "location")
    private List<Offer> offers;

    // Notice the empty constructor, because we need to be able to create an empty Location to add
    // to our model so we can use it with our form
    public Location() {
    }

    public Location(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
