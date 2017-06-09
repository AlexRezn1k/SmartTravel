package ua.nure.smarttravel.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Coordinate implements Serializable {

    @Column(name = "latitude")
    public double latitude;

    @Column(name = "longitude")
    public double longitude;
}
