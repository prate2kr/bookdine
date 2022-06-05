package com.book.dine.model;

import org.springframework.stereotype.Component;

@Component
public class BookDine {

	private String restroName;
	
	private String address;
	
	private String openingHours;
	
	private String averageCost;

	private String telephone;

	private String reviewRating;

	public String getReviewRating(){
		return reviewRating;
	}

	public void setReviewRating(String reviewRating) {
		this.reviewRating = reviewRating;
	}
	
	public String getTelephone(){
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getRestroName() {
		return restroName;
	}

	public void setRestroName(String restroName) {
		this.restroName = restroName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOpeningHours() {
		return openingHours;
	}

	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}

	public String getAverageCost() {
		return averageCost;
	}

	public void setAverageCost(String averageCost) {
		this.averageCost = averageCost;
	}
	
}
