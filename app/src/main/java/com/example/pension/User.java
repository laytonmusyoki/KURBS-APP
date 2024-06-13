package com.example.pension;

public class User {
    public User(String id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    String id,username,email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
