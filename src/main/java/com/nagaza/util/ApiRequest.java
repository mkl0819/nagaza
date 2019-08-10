package com.nagaza.util;

import java.net.URLEncoder;

public class ApiRequest {
    static final String baseUrl = "http://api.data.go.kr/openapi/museum-artgr-info-std";
    static final String serviceKey = "H4YpZjH54XeY1eJpAQgVGYuROd2mS%2FvkjPv63PwxmRUEp%2BBDRUPaKmidYHJlSSbomBSj5zpjG2jVVT8KrUXa%2FQ%3D%3D";
    static final String[] parameters = { "pageNo", "numOfRows", "type", "fcltyNm", "fcltyType", "rdnmadr", "lnmadr",
            "latitude", "hardness", "operPhoneNumber", "operInstitutionNm", "homepageUrl", "fcltyInfo",
            "weekdayOperOpenHhmm", "weekdayOperColseHhmm", "holidayOperOpenHhmm", "holidayCloseOpenHhmm", "rstdeInfo",
            "adultChrge", "yngbgsChrge", "childChrge", "etcChrgeInfo", "fcltyIntrcn", "trnsportInfo", "phoneNumber",
            "institutionNm", "referenceDate", "insttCode", "insttNm" };
    static final String enc = "UTF-8";

    String[] requestParams;
    String requestURL;

    public ApiRequest(String[] requestParams) {
        this.requestParams = requestParams;
        setRequestURL();
    }

    /**
     * @param requestURL the requestURL to set
     * 
     *                   총 29개의 파라미터 - 앞 3개 : 페이지 번호, 데이터 갯수, 반환 타입 - 나머지 : Place
     *                   객체의 속성들
     *
     */
    public void setRequestURL() {

        try {
            StringBuilder urlBuilder = new StringBuilder(baseUrl);

            urlBuilder.append("?" + URLEncoder.encode("ServiceKey", enc) + "=" + serviceKey);
            for (int i = 0, size = parameters.length; i < size; i++) {
                if (this.requestParams[i] != null) {
                    urlBuilder.append("&" + URLEncoder.encode(parameters[i], enc) + "="
                            + URLEncoder.encode(requestParams[i], enc));
                }
            }
            this.requestURL = urlBuilder.toString();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    /**
     * @return the requestURL
     */
    public String getRequestURL() {
        return requestURL;
    }

}
