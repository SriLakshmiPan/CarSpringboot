package com.lakshmi.carresponse;

import java.io.Serializable;

public class CarResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	private String carname;
	private String carmodel;

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String getCarmodel() {
		return carmodel;
	}

	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}

	public void carResponse() {
	}

	public CarResponse(String carname, String carmodel) {
		this.carname = carname;
		this.carmodel = carmodel;
	}

	@Override
	public String toString() {
		return "CarResponse[carname=" + carname + ",carmodel=" + carmodel + "]";
	}
}
