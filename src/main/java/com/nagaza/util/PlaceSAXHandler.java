package com.nagaza.util;

import java.util.ArrayList;
import java.util.List;

import com.nagaza.document.Place;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * PlaceSAXHandler
 */
public class PlaceSAXHandler extends DefaultHandler {
    private List<Place> list;
    private Place place;
    private String temp;

    public PlaceSAXHandler() {
        list = new ArrayList<Place>();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("item")) {
            place = new Place();
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("fcltyNm")) {
            place.setFcltyNm(temp);
        } else if (qName.equals("fcltyType")) {
            place.setFcltyType(temp);
        } else if (qName.equals("rdnmadr")) {
            place.setRdnmadr(temp);
        } else if (qName.equals("lnmadr")) {
            place.setLnmadr(temp);
        } else if (qName.equals("latitude")) {
            place.setLatitude(temp);
        } else if (qName.equals("hardness")) {
            place.setHardness(temp);
        } else if (qName.equals("operPhoneNumber")) {
            place.setOperPhoneNumber(temp);
        } else if (qName.equals("operInstitutionNm")) {
            place.setOperInstitutionNm(temp);
        } else if (qName.equals("homepageUrl")) {
            place.setHomepageUrl(temp);
        } else if (qName.equals("fcltyInfo")) {
            place.setFcltyInfo(temp);
        } else if (qName.equals("weekdayOperOpenHhmm")) {
            place.setWeekdayOperOpenHhmm(temp);
        } else if (qName.equals("weekdayOperColseHhmm")) {
            place.setWeekdayOperColseHhmm(temp);
        } else if (qName.equals("holidayOperOpenHhmm")) {
            place.setHolidayOperOpenHhmm(temp);
        } else if (qName.equals("holidayCloseOpenHhmm")) {
            place.setHolidayCloseOpenHhmm(temp);
        } else if (qName.equals("rstdeInfo")) {
            place.setRstdeInfo(temp);
        } else if (qName.equals("adultChrge")) {
            place.setAdultChrge(temp);
        } else if (qName.equals("yngbgsChrge")) {
            place.setYngbgsChrge(temp);
        } else if (qName.equals("childChrge")) {
            place.setChildChrge(temp);
        } else if (qName.equals("etcChrgeInfo")) {
            place.setEtcChrgeInfo(temp);
        } else if (qName.equals("fcltyIntrcn")) {
            place.setFcltyIntrcn(temp);
        } else if (qName.equals("trnsportInfo")) {
            place.setTrnsportInfo(temp);
        } else if (qName.equals("phoneNumber")) {
            place.setPhoneNumber(temp);
        } else if (qName.equals("institutionNm")) {
            place.setInstitutionNm(temp);
        } else if (qName.equals("referenceDate")) {
            place.setReferenceDate(temp);
        } else if (qName.equals("insttCode")) {
            place.setInsttCode(temp);
        } else if (qName.equals("insttNm")) {
            place.setInsttNm(temp);
        } else if (qName.equals("item")){
            list.add(place);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        temp = new String(ch, start, length).trim();
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