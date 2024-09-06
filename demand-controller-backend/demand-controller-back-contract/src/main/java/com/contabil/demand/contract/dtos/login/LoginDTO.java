package com.contabil.demand.contract.dtos.login;

import com.contabil.demand.contract.enums.login.MethodLogin;

public record LoginDTO(MethodLogin methodLogin, String username, String password) {
	
}
