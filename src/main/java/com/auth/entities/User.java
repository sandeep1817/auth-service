package com.auth.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "users")
@Data
public class User extends BaseEntity{

    @Column(length = 10)
    private String phone_number;


    private String first_name;

    private String last_name;

    private String email;

    private String age;

    private LocalDate date_of_birth;

}
