package com.nagaza.service;

import java.util.List;

import com.nagaza.document.Place;

import org.springframework.stereotype.Service;

/**
 * PlaceService
 */
@Service
public interface PlaceService {

    int loadData();

    List<Place> findAll();

    List<String> findAllName();

    List<Place> findByFcltyNm(String fcltyNm);

    List<Place> findByFcltyNmLike(String fcltyNm);

}