package com.norofff.team1.footballapi.controller;

import com.norofff.team1.footballapi.model.Result;
import com.norofff.team1.footballapi.service.Result_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResultController {
    private final Result_Service result_service;

    @Autowired
    public ResultController(Result_Service result_service){
        this.result_service = result_service;
    }

    @GetMapping("/result")
    public ResponseEntity<List<Result>> findAll() {
        try {
            List<Result> character_classes = result_service.findAll();
            return new ResponseEntity<>(character_classes, HttpStatus.FOUND);
        } catch (DataAccessException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("result/{id}")
    public ResponseEntity<Result> getOne(@PathVariable int id){
        try{
            Result result = result_service.getOne(id);
            return new ResponseEntity<>(result, HttpStatus.FOUND);
        }catch(DataAccessException e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/result")
    public ResponseEntity<Result> create(@RequestBody Result result){
        try{
            result_service.create(result);
            return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
        }catch (DataAccessException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping(value = "/result/{id}")
    public ResponseEntity<Result> update(@PathVariable int id, @RequestBody Result result){
        try{
            result_service.update(id, result);
            return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
        }catch (DataAccessException e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping(value = "/result/{id}")
    public void delete(@PathVariable int id){
        result_service.delete(id);
    }
}
