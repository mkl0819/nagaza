package com.nagaza.controller;

import java.util.List;

import com.nagaza.document.Place;
import com.nagaza.service.PlaceServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * PlaceController
 */
@RestController
@RequestMapping("/api/place")
@CrossOrigin(origins = "http://localhost:8080")
public class PlaceController {
    @Autowired
    private PlaceServiceImpl placeService;
    
    @GetMapping(value="/getPlaces")
    public List<Place> getPlaces(){
        return placeService.findAll();
    }
    
}