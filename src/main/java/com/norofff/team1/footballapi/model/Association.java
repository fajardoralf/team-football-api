package com.norofff.team1.footballapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "association")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Association {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int association_id;    //Primary Key
    private String name;
    private String description;

    public Association(){}

    public Association(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
