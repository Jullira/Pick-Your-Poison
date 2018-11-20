package project.persistence.entities;

import javax.persistence.*;

/**
 * The class for the Postit Note itself.
 * The system generates a table schema based on this class for this entity.
 * Be sure to annotate any entities you have with the @Entity annotation.
 */
@Entity
@Table(name = "types") // If you want to specify a table name, you can do so here
public class type {

    // Declare that this attribute is the id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long typeId;

    private String typeName;


    // Notice the empty constructor, because we need to be able to create an empty PostitNote to add
    // to our model so we can use it with our form
    public type() {
    }

    public type(String typeName) {
        this.typeName = typeName;
    }

    public Long getId() {
        return typeId;
    }

    public void setId(Long typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    // This is for easier debug.
    //@Override
    /*public String toString() {
        return String.format(
                "Postit Note[name=%s, note=%s]",
                name,note);
    }*/
}
