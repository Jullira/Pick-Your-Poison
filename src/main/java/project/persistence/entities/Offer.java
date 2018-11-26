package project.persistence.entities;

import javax.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


@Entity
@Table(name = "offers") // If you want to specify a table name, you can do so here
public class Offer {

    // Declare that this attribute is the id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "location_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Location location;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "drink_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Drink drink;

    private int price;
    private int volume;


    // Notice the empty constructor, because we need to be able to create an empty PostitNote to add
    // to our model so we can use it with our form
    public Offer() {
    }

    public Offer(Location location, Drink drink, int price, int volume) {
        this.location = location;
        this.drink = drink;
        this.price = price;
        this.volume = volume;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLoction(Location location) {
        this.location = location;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
