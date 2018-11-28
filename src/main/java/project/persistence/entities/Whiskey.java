package project.persistence.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

        private String price;

    @ElementCollection
    @CollectionTable(name="type", joinColumns=@JoinColumn(name="type_id"))
    @Column(name="type")
    private List<String> type = new ArrayList<>();
        // Notice the empty constructor, because we need to be able to create an empty PostitNote to add
        // to our model so we can use it with our form
        public Whiskey(){}

        /*public Whiskey(String name, String description, String alcohol) {
            this.name = name;
            this.description = description;
            this.alcohol = alcohol;
        }*/

        public Long getId() { return id;}

        public void setId(Long id) { this.id = id;}

        public String getName() { return name; }

        public void setName(String name) {
            this.name = name;
        }

        public String getPrice() { return price; }

        public void setPrice(String price) {
        this.price = price;
    }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
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

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }
    }


