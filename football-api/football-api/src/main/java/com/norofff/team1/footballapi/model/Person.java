package com.norofff.team1.footballapi.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;



@Data
@Entity
@Table(name = "person")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Person{
    private int person_id;  //Primary key
    @Nullable
    private String address_id; //Foreign key (can be Null)
    private String first_name;
    private String last_name;
    private Date date_of_birth;


    //Default Constructor
    public Person() {}

    //NO address_id Constructor
    public Person(int person_id, String first_name, String last_name, Date date_of_birth) {
        this.person_id = person_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
    }
    //Full Constructor
    public Person(int person_id, String address_id, String first_name, String last_name, Date date_of_birth) {
        this.person_id = person_id;
        this.address_id = address_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
    }
}