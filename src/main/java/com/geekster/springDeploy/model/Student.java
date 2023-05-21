package com.geekster.springDeploy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor@AllArgsConstructor
@Data
public class Student {
    @Id
    private int id;

    private String name;
    private  int roll;

}
