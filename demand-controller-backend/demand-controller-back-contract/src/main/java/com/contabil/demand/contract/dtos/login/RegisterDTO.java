package com.contabil.demand.contract.dtos.login;

import com.contabil.demand.contract.enums.login.MethodLogin;

public record RegisterDTO(MethodLogin methodLogin, String username, String email, String password) {

}
