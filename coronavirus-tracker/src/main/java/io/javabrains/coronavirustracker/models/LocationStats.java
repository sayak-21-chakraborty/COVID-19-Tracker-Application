package io.javabrains.coronavirustracker.models;

public class LocationStats {
	
	private String state;
	private String country;
	private int latestTotalCases;
	private int diffFromPreviousDay;
	
	
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLatestTotalCases() {
		return latestTotalCases;
	}
	public void setLatestTotalCases(int latestTotalCases) {
		this.latestTotalCases = latestTotalCases;
	}
	
		
	public int getDiffFromPreviousDay() {
		return diffFromPreviousDay;
	}
	public void setDiffFromPreviousDay(int diffFromPreviousDay) {
		this.diffFromPreviousDay = diffFromPreviousDay;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LocationStats [state=");
		builder.append(state);
		builder.append(", country=");
		builder.append(country);
		builder.append(", latestTotalCases=");
		builder.append(latestTotalCases);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	

}
