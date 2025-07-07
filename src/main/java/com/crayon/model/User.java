package com.crayon.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class User {
    public User()
    {}

    @JsonProperty("UserName")
    private String username;
    @JsonProperty("Password")
    private String password;

}
