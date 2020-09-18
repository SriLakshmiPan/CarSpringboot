package com.lakshmi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lakshmi.carrequest.CarRequest;
import com.lakshmi.carresponse.CarResponse;

@RestController
@RequestMapping("/car")
public class CarController {
	List<CarRequest> carlist = new ArrayList<CarRequest>();
	List<CarResponse> carlist1 = new ArrayList<CarResponse>();

	@PostMapping("/addCarDetails")
	public String newCarDetails(@RequestBody CarRequest newCarDetails) {
		carlist.add(newCarDetails);
		return "car details addded";
	}

	@GetMapping("/getCarName,ModelByID")
	public String getCarDetails(@RequestParam Integer carid) {
		// System.out.println("carlist" + carlist.toString());
		for (CarRequest car : carlist) {
			if (car.getCarid() == carid) {
				return car.getCarname();
			}
		}
		return null;
	}
}
