package com.delta.restfulTest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.delta.restfulTest.bean.FlightInfoBean;

@Path("InformationService")
public class FlightInfoService {
	
	@GET
	@Path("getDetailInfoXml")
	@Produces(MediaType.APPLICATION_XML)
	public FlightInfoBean getDetailFlightInfoXml() {
		FlightInfoBean flightInfoBean = new FlightInfoBean();
		flightInfoBean.setFlightId("001");
		flightInfoBean.setFlightNumber("DL9045");
		return flightInfoBean;
	}
	
	@GET
	@Path("getDetailInfoJson")
	@Produces(MediaType.APPLICATION_JSON)
	public FlightInfoBean getDetailFlightInfoJson() {
		FlightInfoBean flightInfoBean = new FlightInfoBean();
		flightInfoBean.setFlightId("002");
		flightInfoBean.setFlightNumber("FR9045");
		return flightInfoBean;
	}
}
