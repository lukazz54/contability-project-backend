package com.contabil.demand.producer.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contabil.demand.contract.model.Demand;

@RestController
@RequestMapping(value= "/dashboard")
public class DashboardController {

	@GetMapping("/delayed-demands")
	public List<Demand> getDelayedDemands() {
		return null;
	}
}
