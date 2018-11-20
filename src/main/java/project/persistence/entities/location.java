package project.persistence.entities;

import javax.persistence.*;

/**
 * The class for the Postit Note itself.
 * The system generates a table schema based on this class for this entity.
 * Be sure to annotate any entities you have with the @Entity annotation.
 */
@Entity
@Table(name = "locations") // If you want to specify a table name, you can do so here
public class location {

    // Declare that this attribute is the id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long locationId;

    private String locationName;
    private String address;

    // Notice the empty constructor, because we need to be able to create an empty PostitNote to add
    // to our model so we can use it with our form
    public location() {
    }

    public location(String locationName, String address) {
        this.locationName = locationName;
        this.address = address;
    }

    public Long getId() {
        return locationId;
    }

    public void setId(Long drinksId) {
        this.locationId = locationId;
    }

    public String getName() {
        return locationName;
    }

    public void setName(String locationName) {
        this.locationName = locationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    // This is for easier debug.
    //@Override
    /*public String toString() {
        return String.format(
                "Postit Note[name=%s, note=%s]",
                name,note);
    }*/
}
