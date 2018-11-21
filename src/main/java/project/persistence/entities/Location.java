package project.persistence.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "locations") // If you want to specify a table name, you can do so here
public class Location {


    // Declare that this attribute is the id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String adress;
    private String coordinates;

    // Notice the empty constructor, because we need to be able to create an empty PostitNote to add
    // to our model so we can use it with our form
    public Location(){}

    public Location(String name, String description, String alcohol) {

        this.name = name;
        this.adress = description;
        this.coordinates = alcohol;
    }

    public Long getId() { return id;}

    public void setId(Long id) { this.id = id;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    // This is for easier debug.
    @Override
    public String toString() {
        return String.format(
                "Whiskey[name=%s, adress=%s, coordinates=%s]",
                name,adress,coordinates);
    }
}
