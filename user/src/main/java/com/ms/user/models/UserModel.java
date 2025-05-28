package com.ms.user.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_USERS")
public class UserModel implements Serializable {
    private static final long SerialVersionUID = 1L;

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userID;
    private String name;
    private String email;

    public UserModel() {
    }

    public UserModel(UUID userID, String name, String email) {
        this.userID = userID;
        this.name = name;
        this.email = email;
    }

    public UUID getUserID() {
        return userID;
    }

    public void setUserID(UUID userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
