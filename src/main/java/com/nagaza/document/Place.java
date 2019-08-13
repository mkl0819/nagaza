package com.nagaza.document;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Place
 */
@Document(collection = "place")
public class Place implements Serializable {
	static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String imgurl;
	private String fcltyNm;
	private String fcltyType;
	private String rdnmadr;
	private String lnmadr;
	private String latitude;
	private String hardness;
	private String operPhoneNumber;
	private String operInstitutionNm;
	private String homepageUrl;
	private String fcltyInfo;
	private String weekdayOperOpenHhmm;
	private String weekdayOperColseHhmm;
	private String holidayOperOpenHhmm;
	private String holidayCloseOpenHhmm;
	private String rstdeInfo;
	private String adultChrge;
	private String yngbgsChrge;
	private String childChrge;
	private String etcChrgeInfo;
	private String fcltyIntrcn;
	private String trnsportInfo;
	private String phoneNumber;
	private String institutionNm;
	private String referenceDate;
	private String insttCode;
	private String insttNm;

	public Place() {
	}

	public Place(String id, String imgurl, String fcltyNm, String fcltyType, String rdnmadr, String lnmadr,
			String latitude, String hardness, String operPhoneNumber, String operInstitutionNm, String homepageUrl,
			String fcltyInfo, String weekdayOperOpenHhmm, String weekdayOperColseHhmm, String holidayOperOpenHhmm,
			String holidayCloseOpenHhmm, String rstdeInfo, String adultChrge, String yngbgsChrge, String childChrge,
			String etcChrgeInfo, String fcltyIntrcn, String trnsportInfo, String phoneNumber, String institutionNm,
			String referenceDate, String insttCode, String insttNm) {
		super();
		this.id = id;
		this.imgurl = imgurl;
		this.fcltyNm = fcltyNm;
		this.fcltyType = fcltyType;
		this.rdnmadr = rdnmadr;
		this.lnmadr = lnmadr;
		this.latitude = latitude;
		this.hardness = hardness;
		this.operPhoneNumber = operPhoneNumber;
		this.operInstitutionNm = operInstitutionNm;
		this.homepageUrl = homepageUrl;
		this.fcltyInfo = fcltyInfo;
		this.weekdayOperOpenHhmm = weekdayOperOpenHhmm;
		this.weekdayOperColseHhmm = weekdayOperColseHhmm;
		this.holidayOperOpenHhmm = holidayOperOpenHhmm;
		this.holidayCloseOpenHhmm = holidayCloseOpenHhmm;
		this.rstdeInfo = rstdeInfo;
		this.adultChrge = adultChrge;
		this.yngbgsChrge = yngbgsChrge;
		this.childChrge = childChrge;
		this.etcChrgeInfo = etcChrgeInfo;
		this.fcltyIntrcn = fcltyIntrcn;
		this.trnsportInfo = trnsportInfo;
		this.phoneNumber = phoneNumber;
		this.institutionNm = institutionNm;
		this.referenceDate = referenceDate;
		this.insttCode = insttCode;
		this.insttNm = insttNm;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the imgurl
	 */
	public String getImgurl() {
		return imgurl;
	}

	/**
	 * @param imgurl the imgurl to set
	 */
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public String getFcltyNm() {
		return fcltyNm;
	}

	public void setFcltyNm(String fcltyNm) {
		this.fcltyNm = fcltyNm;
	}

	public String getFcltyType() {
		return fcltyType;
	}

	public void setFcltyType(String fcltyType) {
		this.fcltyType = fcltyType;
	}

	public String getRdnmadr() {
		return rdnmadr;
	}

	public void setRdnmadr(String rdnmadr) {
		this.rdnmadr = rdnmadr;
	}

	public String getLnmadr() {
		return lnmadr;
	}

	public void setLnmadr(String lnmadr) {
		this.lnmadr = lnmadr;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getHardness() {
		return hardness;
	}

	public void setHardness(String hardness) {
		this.hardness = hardness;
	}

	public String getOperPhoneNumber() {
		return operPhoneNumber;
	}

	public void setOperPhoneNumber(String operPhoneNumber) {
		this.operPhoneNumber = operPhoneNumber;
	}

	public String getOperInstitutionNm() {
		return operInstitutionNm;
	}

	public void setOperInstitutionNm(String operInstitutionNm) {
		this.operInstitutionNm = operInstitutionNm;
	}

	public String getHomepageUrl() {
		return homepageUrl;
	}

	public void setHomepageUrl(String homepageUrl) {
		this.homepageUrl = homepageUrl;
	}

	public String getFcltyInfo() {
		return fcltyInfo;
	}

	public void setFcltyInfo(String fcltyInfo) {
		this.fcltyInfo = fcltyInfo;
	}

	public String getWeekdayOperOpenHhmm() {
		return weekdayOperOpenHhmm;
	}

	public void setWeekdayOperOpenHhmm(String weekdayOperOpenHhmm) {
		this.weekdayOperOpenHhmm = weekdayOperOpenHhmm;
	}

	public String getWeekdayOperColseHhmm() {
		return weekdayOperColseHhmm;
	}

	public void setWeekdayOperColseHhmm(String weekdayOperColseHhmm) {
		this.weekdayOperColseHhmm = weekdayOperColseHhmm;
	}

	public String getHolidayOperOpenHhmm() {
		return holidayOperOpenHhmm;
	}

	public void setHolidayOperOpenHhmm(String holidayOperOpenHhmm) {
		this.holidayOperOpenHhmm = holidayOperOpenHhmm;
	}

	public String getHolidayCloseOpenHhmm() {
		return holidayCloseOpenHhmm;
	}

	public void setHolidayCloseOpenHhmm(String holidayCloseOpenHhmm) {
		this.holidayCloseOpenHhmm = holidayCloseOpenHhmm;
	}

	public String getRstdeInfo() {
		return rstdeInfo;
	}

	public void setRstdeInfo(String rstdeInfo) {
		this.rstdeInfo = rstdeInfo;
	}

	public String getAdultChrge() {
		return adultChrge;
	}

	public void setAdultChrge(String adultChrge) {
		this.adultChrge = adultChrge;
	}

	public String getYngbgsChrge() {
		return yngbgsChrge;
	}

	public void setYngbgsChrge(String yngbgsChrge) {
		this.yngbgsChrge = yngbgsChrge;
	}

	public String getChildChrge() {
		return childChrge;
	}

	public void setChildChrge(String childChrge) {
		this.childChrge = childChrge;
	}

	public String getEtcChrgeInfo() {
		return etcChrgeInfo;
	}

	public void setEtcChrgeInfo(String etcChrgeInfo) {
		this.etcChrgeInfo = etcChrgeInfo;
	}

	public String getFcltyIntrcn() {
		return fcltyIntrcn;
	}

	public void setFcltyIntrcn(String fcltyIntrcn) {
		this.fcltyIntrcn = fcltyIntrcn;
	}

	public String getTrnsportInfo() {
		return trnsportInfo;
	}

	public void setTrnsportInfo(String trnsportInfo) {
		this.trnsportInfo = trnsportInfo;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getInstitutionNm() {
		return institutionNm;
	}

	public void setInstitutionNm(String institutionNm) {
		this.institutionNm = institutionNm;
	}

	public String getReferenceDate() {
		return referenceDate;
	}

	public void setReferenceDate(String referenceDate) {
		this.referenceDate = referenceDate;
	}

	public String getInsttCode() {
		return insttCode;
	}

	public void setInsttCode(String insttCode) {
		this.insttCode = insttCode;
	}

	public String getInsttNm() {
		return insttNm;
	}

	public void setInsttNm(String insttNm) {
		this.insttNm = insttNm;
	}

	@Override
	public String toString() {
		return "[" + this.id + " , " + this.fcltyNm + " ] ";
	}
}