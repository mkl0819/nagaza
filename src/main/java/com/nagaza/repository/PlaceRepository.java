package com.nagaza.repository;

import java.util.List;

import com.nagaza.document.Place;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * PlaceRepository
 */
@Repository
public interface PlaceRepository extends MongoRepository<Place, String> {

    List<Place> findByFcltyNm(String fcltyNm);

    List<Place> findByFcltyNmLike(String fcltyNm);

    long count();

    @Query(value = "{}", fields = "{fcltyNm: 1, _id: 0}")
    List<String> findAllName();
}