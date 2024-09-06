package com.contabil.demand.contract.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("Demand-Product")
public class DemandProduct {

	@Id
	private String id;
	
	private String productName;
	
	private String amountRequested;
	
	private String color;
	
}
