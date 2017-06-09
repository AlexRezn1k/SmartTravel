package ua.nure.smarttravel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.nure.smarttravel.entity.Place;
import ua.nure.smarttravel.service.PlaceService;

import java.util.List;
import java.util.stream.Stream;


@CrossOrigin
@RestController
@RequestMapping(value = "/place")
public class PlaceController {

    @Autowired
    private PlaceService placeService;


    @RequestMapping(value = "/all")
    public List<Place> getAll() {
        return placeService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Place get(@PathVariable(value = "id") int id) {
        return placeService.getOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Place place) {
        placeService.add(place);
    }


    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody Place place) {
        placeService.update(place);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") int id) {
        placeService.delete(id);
    }



}
