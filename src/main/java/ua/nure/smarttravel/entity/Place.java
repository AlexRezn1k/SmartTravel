package ua.nure.smarttravel.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Александр on 5/10/2017.
 */
@Entity(name = "place")
@Table(name = "place")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Place implements Serializable {


    public Place(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "place_id")
    private int id;

    @Column(name = "place_name")
    private String placeName;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Embedded
    private Coordinate coordinate;

    @OneToMany(mappedBy = "place")
    @JsonBackReference
    private List<Automobile> automobiles;

    public List<Automobile> getAutomobiles() { return automobiles; }

    public void setAutomobiles(List<Automobile> automobiles) { this.automobiles = automobiles; }

}
