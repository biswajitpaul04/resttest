package com.delta.restfulTest.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "flightInfo")
public class FlightInfoBean {
	
	private String flightId;
	private String flightName;
	private String flightOrigin;
	private String flightDestination;
	private String flightNumber;
	
	public String getFlightId() {
		return flightId;
	}
	@XmlElement
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	@XmlElement
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFlightOrigin() {
		return flightOrigin;
	}
	@XmlElement
	public void setFlightOrigin(String flightOrigin) {
		this.flightOrigin = flightOrigin;
	}
	public String getFlightDestination() {
		return flightDestination;
	}
	@XmlElement
	public void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}
	@XmlElement
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
}
