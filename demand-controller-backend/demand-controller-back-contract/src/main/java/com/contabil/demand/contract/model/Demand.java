package com.contabil.demand.contract.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("Demand-Information")
public class Demand {

	@Id
	private String id;
	
	private Client userInformations;
	
	private String value;
	
	private LocalDate deadline;
	
	private List<Payment> payments;
	
	private List<DemandProduct> products;
	
	private String demandDescription;
	
	private List<String> demandOldPictures;
	
	private Accountable accountable;
	
}
