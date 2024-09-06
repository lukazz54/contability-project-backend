package com.contabil.demand.contract.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.contabil.demand.contract.enums.RoleEnum;

import lombok.Data;

@Data
@Document("Accountable")
public class Accountable {
	
	@Id
	private String id;

	private String name;
	
	private String urlPhoto;
	
	private RoleEnum role;
	
}
