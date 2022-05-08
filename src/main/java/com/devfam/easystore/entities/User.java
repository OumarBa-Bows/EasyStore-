package com.devfam.easystore.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@Getter @Setter @NoArgsConstructor
public class User {
    @Id @GeneratedValue
    private Long Id;
    private String firstName;
    private String lastName;
    private String login;
    private String mail;
    private String password;

    public User(String firstName, String lastName ,String login, String mail, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.mail = mail;
        this.password = password;
    }
}
