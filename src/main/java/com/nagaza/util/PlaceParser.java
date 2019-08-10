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

    public PlaceParser(String[] requestParams) {
        this.requestParams = requestParams;
        loadData();
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
}