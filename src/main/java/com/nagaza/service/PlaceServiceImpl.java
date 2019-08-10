package com.nagaza.service;

import java.util.List;

import com.nagaza.document.Place;
import com.nagaza.repository.PlaceRepositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * PlaceServiceImpl
 */
@Service
public class PlaceServiceImpl implements PlaceService{
    @Autowired
    PlaceRepositoryImpl placeRepo;

    @Override
    public List<Place> findAll() {
        return placeRepo.findAll();
    }

    @Override
    public List<Place> findByFcltyNm(String fcltyNm) {
        return placeRepo.findByFcltyNm(fcltyNm);
    }
    
}