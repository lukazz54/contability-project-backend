package com.contabil.demand.contract.dtos.user;

import com.contabil.demand.contract.enums.RoleEnum;

public record UserDTO (
         String name,
         String email,
         RoleEnum role,
         String username,
         String token
) {
}
