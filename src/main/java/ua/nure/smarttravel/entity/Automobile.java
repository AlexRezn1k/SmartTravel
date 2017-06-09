package ua.nure.smarttravel.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Александр on 5/10/2017.
 */

@Entity(name = "automobile")
@Table(name = "automobile")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Automobile implements Serializable {

    public Automobile(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "automobile_id")
    private int id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "booking_price")
    private int bookingPrice;

    @Embedded
    private Coordinate coordinate;

    @Column(name = "city")
    private String city;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name="place_id")
    private Place place;


}
