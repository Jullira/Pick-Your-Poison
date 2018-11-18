package project.persistence.entities;

import javax.persistence.*;

    /**
     * The class for the Postit Note itself.
     * The system generates a table schema based on this class for this entity.
     * Be sure to annotate any entities you have with the @Entity annotation.
     */

    @Entity
    @Table(name = "whiskey") // If you want to specify a table name, you can do so here
    public class Whiskey {

        // Declare that this attribute is the id
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;
        private String description;
        private String alcohol;

        // Notice the empty constructor, because we need to be able to create an empty PostitNote to add
        // to our model so we can use it with our form

        public Whiskey(String name, String description, String alcohol) {
            this.name = name;
            this.description = description;
            this.alcohol = alcohol;
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

        public String getDescription() {
            return note;
        }

        public void setDescription(String description) {
            this.note = description;
        }

        public String getAlcohol() {
            return alcohol;
        }

        public void setAlcohol(String alcohol) {
            this.alcohol = alcohol;
        }

        // This is for easier debug.
        @Override
        public String toString() {
            return String.format(
                    "Whiskey[name=%s, description=%s, alcohik=%s]",
                    name,description, alcohol);
        }
    }

}
