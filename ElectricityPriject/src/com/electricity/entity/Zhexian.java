package com.electricity.entity;

import java.util.ArrayList;

public class Zhexian {
	private ArrayList<Float> dataList=new ArrayList<Float>();
	private ArrayList<String> timesList=new ArrayList<String>();
	private String cityName;
	public ArrayList<Float> getDataList() {
		return dataList;
	}
	public void setDataList(ArrayList<Float> dataList) {
		this.dataList = dataList;
	}
	public ArrayList<String> getTimesList() {
		return timesList;
	}
	public void setTimesList(ArrayList<String> timesList) {
		this.timesList = timesList;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	


}
