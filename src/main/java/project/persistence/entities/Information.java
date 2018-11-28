package project.persistence.entities;

import javax.persistence.*;

/**
 * The class for the Information itself.
 * The system generates a table schema based on this class for this entity.
 * Be sure to annotate any entities you have with the @Entity annotation.
 */
@Entity
@Table(name = "information") // If you want to specify a table name, you can do so here
public class Information {

    // Declare that this attribute is the id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String drink;
    private String location;
    private String address;
    private String price;

    // Notice the empty constructor, because we need to be able to create an empty Information to add
    // to our model so we can use it with our form
    public Information() {
    }

    public Information(String drink, String location ,String address, String price) {
        this.drink = drink;
        this.location = location;
        this.address = address;
        this.price = price;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    // This is for easier debug.
    //@Override
    /*public String toString() {
        return String.format(
                "Postit Note[name=%s, note=%s]",
                name,note);
    }*/
}
