package com.contabil.demand.producer.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contabil.demand.contract.model.Demand;
import com.contabil.demand.producer.services.DemandService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(value= "/demand")
public class DemandController {

	private final DemandService demandService;
	
	
	@GetMapping("/get-demands")
	public ResponseEntity<List<Demand>> getAllDemands() {
		return ResponseEntity.ok(demandService.getDemands());
	}
	
	@PostMapping("/create-new-demand")
	public ResponseEntity<?> createNewDemand(@RequestBody Demand demand) {
		
		return demandService.insertDemand(demand);
	}
}
