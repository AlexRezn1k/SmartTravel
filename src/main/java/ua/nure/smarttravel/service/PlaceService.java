package ua.nure.smarttravel.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import ua.nure.smarttravel.entity.Place;
import ua.nure.smarttravel.repository.PlaceRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Service
public class PlaceService {




    @Autowired
    private PlaceRepository placeRepository;
    @Autowired
    private PlaceService placeService;

    public List<Place> getAll() {
        return placeRepository.findAll();
    }

    public Place getOne(int id) {
      return placeRepository.getOne(id);
    }

    public void add(Place bucket) {
        placeRepository.save(bucket);
    }

    public void add(List<Place> places) {
        placeRepository.saveAll(places);
    }

    public void update(Place bucket) {
        placeRepository.save(bucket);
    }

    public void delete(int id) {
        placeRepository.deleteById(id);
    }

}
