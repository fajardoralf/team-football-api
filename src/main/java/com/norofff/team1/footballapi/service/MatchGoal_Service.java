package com.norofff.team1.footballapi.service;

import com.norofff.team1.footballapi.model.MatchGoal;

import java.util.List;

public interface MatchGoal_Service {
    List<MatchGoal> findAll();

    MatchGoal getOne(int id);
    MatchGoal create(MatchGoal matchGoal);
    MatchGoal update(int id, MatchGoal matchGoal);
    void delete(int id);

    List<MatchGoal> findMatchIdGoal(int id);
}
