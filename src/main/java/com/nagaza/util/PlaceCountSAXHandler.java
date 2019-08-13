package com.nagaza.util;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * PlaceSAXHandler
 */
public class PlaceCountSAXHandler extends DefaultHandler {
    private String temp;
    private int totalCount;

    public PlaceCountSAXHandler() {
        totalCount = -1;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("totalCount")) {
            totalCount = 0;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("totalCount")) {
            totalCount = Integer.parseInt(temp);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        temp = new String(ch, start, length).trim();
    }

    /**
     * @return the totalCount
     */
    public int getTotalCount() {
        return totalCount;
    }
}