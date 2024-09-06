package com.contabil.demand.contract.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("Payment")
public class Payment {
	
	@Id
	private String id;
	
	private String userPayment; //-> validar se realmente há a necessidade desse userPayment
	
	private String paymentMethod;
	
	private String paymentValue;
	
	
}
