package com.contabil.demand.contract.documents.login;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import com.contabil.demand.contract.enums.RoleEnum;

import lombok.Data;

@Data
@Document("users")
public class User {
	
	@Id
	private String id;
	private String name;
	private String email;
	private RoleEnum role;
	private String username;
	private String password;
	
	@Transient
	private String token;
	
}
