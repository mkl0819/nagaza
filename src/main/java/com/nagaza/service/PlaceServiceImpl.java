package com.nagaza.service;

import java.util.ArrayList;
import java.util.List;

import com.nagaza.document.Place;
import com.nagaza.repository.PlaceRepository;
import com.nagaza.util.PlaceParser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * PlaceServiceImpl
 */
@Service
public class PlaceServiceImpl implements PlaceService {
    @Autowired
    PlaceRepository placeRepo;

    String[] requestParams;
    PlaceParser PlaceParser;

    @Override
    public int loadData() {
        requestParams = new String[29];
        int apiCount = getApiDataSize();
        int dbcount = (int) placeRepo.count();

        if (dbcount < apiCount) {
            List<Place> updateList = new ArrayList<>();
            requestParams = new String[29];
            requestParams[0] = "1";
            requestParams[1] = apiCount + "";
            requestParams[2] = "xml";
            List<Place> totalList = new PlaceParser(requestParams, "data").getList();

            updateList = totalList.subList(dbcount, apiCount);

            placeRepo.insert(updateList);
            System.out.println(updateList.size() + "개의 데이터를 저장했습니다.");
            return updateList.size();
        } else {
            System.out.println("load할 데이터가 없습니다.");
            return -1;
        }

    }

    public int getApiDataSize() {
        int totalCount;
        requestParams = new String[29];
        requestParams[0] = "1";
        requestParams[1] = "1";
        requestParams[2] = "xml";

        totalCount = new PlaceParser(requestParams, "count").getTotalCount();

        return totalCount;
    }

    @Override
    public List<Place> findAll() {
        return placeRepo.findAll();
    }

    @Override
    public List<Place> findByFcltyNm(String fcltyNm) {
        return placeRepo.findByFcltyNm(fcltyNm);
    }

    @Override
    public List<Place> findByFcltyNmLike(String fcltyNm) {
        return placeRepo.findByFcltyNmLike(fcltyNm);
    }

    @Override
    public List<String> findAllName() {

        return placeRepo.findAllName();
    }

}