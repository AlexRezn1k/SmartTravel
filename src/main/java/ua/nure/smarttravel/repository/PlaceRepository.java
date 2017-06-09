package ua.nure.smarttravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ua.nure.smarttravel.entity.Place;

import java.util.stream.Stream;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Integer> {


}
