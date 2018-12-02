package project.persistence.entities;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


@Entity
@Table(name = "offers") // table name
public class Offer {


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
    private String name;


    // Notice the empty constructor, because we need to be able to create an empty Offer to add
    // to our model so we can use it with our form
    public Offer() {
    }

    public Offer(Location location, Drink drink, int price, int volume, String name) {
        this.location = location;
        this.drink = drink;
        this.price = price;
        this.volume = volume;
        this.name = name;
    }


    public void setLocation(Location location) {
        this.location = location;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
