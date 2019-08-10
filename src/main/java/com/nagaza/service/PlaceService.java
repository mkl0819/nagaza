package com.nagaza.service;

import java.util.List;

import com.nagaza.document.Place;

import org.springframework.stereotype.Service;

/**
 * PlaceService
 */
@Service
public interface PlaceService {
    // String findAll();
    List<Place> findAll();
    List<Place> findByFcltyNm(String fcltyNm);
    
}