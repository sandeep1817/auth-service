package com.auth.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    @JsonIgnore
    private Long id;
    @CreationTimestamp
    @JsonIgnore
    @Setter
    private Date createdAt;
    @UpdateTimestamp
    @JsonIgnore
    private Date updatedAt;
}
