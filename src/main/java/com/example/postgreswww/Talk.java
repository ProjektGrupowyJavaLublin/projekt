package com.example.postgreswww;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Talk {

    @Id
    @GeneratedValue
    private String id;
    private String topic;
}
