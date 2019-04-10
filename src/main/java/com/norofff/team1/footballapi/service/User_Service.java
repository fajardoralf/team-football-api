package com.norofff.team1.footballapi.service;

import com.norofff.team1.footballapi.model.Users;

import java.util.List;


public interface User_Service {
    List<Users> findAll();

    Users getOne(int id);
    Users create(Users users);
    Users update(int id, Users users);
    void delete(int id);
}