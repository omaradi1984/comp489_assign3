package com.example.assignment3;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private String username; // Unique identifier for the user
    private String contactInfo; // IP address and port, e.g., "192.168.1.1:5000"

    // Constructors, getters, and setters
    public User() {
    }

    public User(String username, String contactInfo) {
        this.username = username;
        this.contactInfo = contactInfo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
