package com.nagaza.util;

import java.util.List;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import com.nagaza.document.Place;

/**
 * PlaceParser
 */
public class PlaceParser {
    private String[] requestParams;
    private String requestURL;
    // private StringBuilder xml;

    private List<Place> list;
    private int totalCount;

    public PlaceParser(String[] requestParams, String method) {
        this.requestParams = requestParams;
        if (method == "data") {
            loadData();
        } else if (method == "count") {
            loadCount();
        }
    }

    private void loadData() {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        try {
            SAXParser parser = factory.newSAXParser();
            PlaceSAXHandler handler = new PlaceSAXHandler();
            ApiRequest apirequest = new ApiRequest(requestParams);

            requestURL = apirequest.getRequestURL();
            parser.parse(requestURL, handler);
            list = handler.getList();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadCount() {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        try {
            SAXParser parser = factory.newSAXParser();
            PlaceCountSAXHandler counthandler = new PlaceCountSAXHandler();
            ApiRequest apirequest = new ApiRequest(requestParams);

            requestURL = apirequest.getRequestURL();
            parser.parse(requestURL, counthandler);
            totalCount = counthandler.getTotalCount();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @return the list
     */
    public List<Place> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(List<Place> list) {
        this.list = list;
    }

    /**
     * @return the totalCount
     */
    public int getTotalCount() {
        return totalCount;
    }
}