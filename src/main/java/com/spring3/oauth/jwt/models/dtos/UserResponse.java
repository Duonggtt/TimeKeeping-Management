package com.spring3.oauth.jwt.models.dtos;

import com.spring3.oauth.jwt.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserResponse {

    private Integer id;
    private String username;
    private Set<Role> roles;


}
