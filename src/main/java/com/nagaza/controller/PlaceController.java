package com.nagaza.controller;

import java.util.List;

import com.nagaza.document.Place;
import com.nagaza.service.PlaceServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * PlaceController
 */
@RestController
@RequestMapping("/api/place")
public class PlaceController {

    @Autowired
    private PlaceServiceImpl placeService;

    @GetMapping(value = "/getPlaces")
    public List<Place> getPlaces() {
        return placeService.findAll();
    }

    @GetMapping(value = "/getPlaceNames")
    public List<String> getPlaceNames() {
        // List<Place> data = (List<Place>) placeService.findAllName();
        // List<String> sendData = new ArrayList<>();
        // for (Place p : data) {
        //     sendData.add(p.fcltyNm);
        // }
        // System.out.println(data.get(0).getClass());
        // return data;
        return placeService.findAllName();
    }

    @GetMapping(value = "/getPlaces/FcltyNm/{fcltyNm}")
    public List<Place> getPlacesByFcltyNm(@PathVariable String fcltyNm) {
        return placeService.findByFcltyNm(fcltyNm);
    }

    @GetMapping(value = "/getPlaces/FcltyNm/Like/{fcltyNm}")
    public List<Place> getPlacesByFcltyNmLike(@PathVariable String fcltyNm) {
        return placeService.findByFcltyNmLike(fcltyNm);
    }

    @GetMapping(value = "/loadPlaces")
    public int loadPlaces() {
        return placeService.loadData();
    }

}