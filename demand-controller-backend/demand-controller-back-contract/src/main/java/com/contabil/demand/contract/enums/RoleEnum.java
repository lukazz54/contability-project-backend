package com.contabil.demand.contract.enums;

public enum RoleEnum {
	
	EMPLOYEE ("Funcionário"),
	RH ("Recursos Humano"),
	MANAGER ("Gerente"),
	CEO ("CEO");
	
	public String getRole;
	
	RoleEnum(String value) {
		getRole = value;
	}
}
