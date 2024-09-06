package com.contabil.demand.contract.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("Client")
public class Client {
	
	@Id
	private String id;
	
	private String firstName;
	
	private String surname;
	
	private String adress;
	
	private String number;
	
	private String complement;
	
	private String zipcode;
	
	private String phoneNumber;
}
