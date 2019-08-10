package com.nagaza.repository;
import java.util.List;

import com.nagaza.document.Place;

import org.springframework.data.repository.Repository;

/**
 * PlaceRepository
 */
@org.springframework.stereotype.Repository
public interface PlaceRepository extends Repository<Place, String>{
    List<Place> findAll();

    List<Place> findByFcltyNm(String fcltyNm);

}