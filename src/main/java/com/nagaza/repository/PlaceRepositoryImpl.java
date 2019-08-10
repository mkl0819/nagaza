package com.nagaza.repository;

import java.util.List;

import com.nagaza.document.Place;
import com.nagaza.util.PlaceParser;

import org.springframework.stereotype.Repository;

/**
 * PlaceRepositoryImpl
 */
@Repository
public class PlaceRepositoryImpl implements PlaceRepository {
    String[] requestParams;
    PlaceParser placeParser;


    @Override
    public List<Place> findAll() {
        requestParams = new String[29];
        requestParams[0] = "1";
        requestParams[1] = "3";
        requestParams[2] = "xml";

        placeParser = new PlaceParser(requestParams);

        return placeParser.getList();
    }

	@Override
	public List<Place> findByFcltyNm(String fcltyNm) {
        requestParams = new String[29];
        requestParams[0] = "1";
        requestParams[1] = "3";
        requestParams[2] = "xml";
        requestParams[3] = fcltyNm;

        placeParser = new PlaceParser(requestParams);
        
        return placeParser.getList();
	}
    
}