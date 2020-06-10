package com.demo.springTest.dropDownMvc.controller;

import java.util.ArrayList;

public class Bands {
	
	private ArrayList<String> bandName;
	private String bands;
	
	public Bands() {
		
		bandName=new ArrayList<String>();
		bandName.add("Cold Play");
		bandName.add("Backstreet Boys");
	}
		
	public String getBands() {
		return bands;
	}

	public void setBands(String bands) {
		this.bands = bands;
	}

	public ArrayList<String> getBandName() {
		return bandName;
	}
	
	

}
