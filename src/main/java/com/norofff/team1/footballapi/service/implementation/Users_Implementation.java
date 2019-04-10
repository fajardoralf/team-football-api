package com.norofff.team1.footballapi.service.implementation;

import com.norofff.team1.footballapi.model.Users;
import com.norofff.team1.footballapi.repository.Users_Repository;
import com.norofff.team1.footballapi.service.User_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Users_Implementation implements User_Service {
    private final Users_Repository users_repository;

    @Autowired
    public Users_Implementation(Users_Repository users_repository) {
        this.users_repository = users_repository;
    }

    public List<Users> findAll() {
        return users_repository.findAll();
    }

    public Users getOne(int id) {return users_repository.getOne(id);}

    public Users create(Users users) {return users_repository.save(users);}

    public Users update(int id, Users users){
        users.setUser_id(id);
        return users_repository.save(users);
    }

    public void delete(int id){
        try{
            users_repository.deleteById(id);
        }catch (IllegalAccessError e){
            throw new IllegalAccessError();
        }
    }
}
