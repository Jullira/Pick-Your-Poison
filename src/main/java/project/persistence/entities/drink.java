package project.persistence.entities;

import javax.persistence.*;

/**
 * The class for the Postit Note itself.
 * The system generates a table schema based on this class for this entity.
 * Be sure to annotate any entities you have with the @Entity annotation.
 */
@Entity
@Table(name = "drinks") // If you want to specify a table name, you can do so here
public class drink {

    // Declare that this attribute is the id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long drinkId;

    private String drinkName;
    private int drinkType;
    private String description;

    // Notice the empty constructor, because we need to be able to create an empty PostitNote to add
    // to our model so we can use it with our form
    public drink() {
    }

    public drink(String drinksName, int drinksType, String description) {
        this.drinkName = drinksName;
        this.drinkType = drinksType;
        this.description = description;
    }

    public Long getId() {
        return drinkId;
    }

    public void setId(Long drinksId) {
        this.drinkId = drinksId;
    }

    public String getName() {
        return drinkName;
    }

    public void setName(String drinksName) {
        this.drinkName = drinksName;
    }

    public int getType() {
        return drinkType;
    }

    public void setType(int drinksType) {
        this.drinkType = drinksType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    // This is for easier debug.
    //@Override
    /*public String toString() {
        return String.format(
                "Postit Note[name=%s, note=%s]",
                name,note);
    }*/
}
