package com.lakshmi.carrequest;

import java.io.Serializable;

public class CarRequest implements Serializable {
	private Integer carid;
	private String carname;
	private String carmodel;

	public Integer getCarid() {
		return carid;
	}

	public void setCarid(Integer carid) {
		this.carid = carid;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String getcarmodel() {
		return carmodel;
	}

	public void setcarmodel(String carmodel) {
		this.carmodel = carmodel;
	}

	public void CarRequest() {
	}

	public void CarRequest(Integer carid, String carname, String carmodel) {
		this.carid = carid;
		this.carname = carname;
		this.carmodel = carmodel;
	}

	@Override
	public String toString() {
		return "CarRequest[carid=" + carid + ",carname= " + carname + ",carmodel=" + carmodel + "]";
	}
}