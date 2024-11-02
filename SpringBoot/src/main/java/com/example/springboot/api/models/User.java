package com.example.springboot.api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.time.LocalDateTime;

@Entity
public class User {
    @Id
    public int id;

    public String username;

    public LocalDateTime createdAt;
}
