package project.persistence.entities;

import javax.persistence.*;

/**
 * The class for the Postit Note itself.
 * The system generates a table schema based on this class for this entity.
 * Be sure to annotate any entities you have with the @Entity annotation.
 */
@Entity
@Table(name = "offers") // If you want to specify a table name, you can do so here
public class offer {

    // Declare that this attribute is the id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long offerId;

    private int locationId;
    private int drinkId;
    private int price;
    private int mLiters;


    // Notice the empty constructor, because we need to be able to create an empty PostitNote to add
    // to our model so we can use it with our form
    public offer() {
    }

    public offer(String locationName, String address) {
        this.locationId = locationId;
        this.drinkId = drinkId;
        this.price = price;
        this.mLiters = mLiters;
    }

    public Long getId() {
        return offerId;
    }

    public void setId(Long offerId) {
        this.offerId = offerId;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLoctionId(int locationId) {
        this.locationId = locationId;
    }

    public int getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(int drinkId) {
        this.drinkId = drinkId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMLiters() {
        return mLiters;
    }

    public void setMliters(int Mliters) {
        this.mLiters = mLiters;
    }
    // This is for easier debug.
    //@Override
    /*public String toString() {
        return String.format(
                "Postit Note[name=%s, note=%s]",
                name,note);
    }*/
}
