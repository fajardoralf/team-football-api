package com.norofff.team1.footballapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    private String username;
    private String password;
    private boolean role;

    public Users(){

    }
    public Users(Users user){
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.role = user.isRole();
    }
    public Users(String username, String password){
        this.username = username;
        this.password = password;
    }
    public Users(int user_id, String username, String password, boolean role) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Users(String username, String password, boolean role) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isRole() {
        return role;
    }
}

