package com.norofff.team1.footballapi.service.implementation;

import com.norofff.team1.footballapi.model.Team;
import com.norofff.team1.footballapi.repository.Team_Repository;
import com.norofff.team1.footballapi.service.Team_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Team_Implementation implements Team_Service {

    private final Team_Repository team_repository;

    @Autowired
    public Team_Implementation(Team_Repository team_repository) {
        this.team_repository = team_repository;
    }

    public List<Team> findAll() {
        return team_repository.findAll();
    }
}