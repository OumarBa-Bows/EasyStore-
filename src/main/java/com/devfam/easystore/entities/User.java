package com.devfam.easystore.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "user")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class User implements Serializable {
    @Id @GeneratedValue
    private Long Id;
    private String firstName;
    private String lastName;
    private String login;
    private String mail;
    private String password;

}
