package com.example.assignment3;

import jakarta.persistence.*;
@Entity
public class FileMetaData {

    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String filename;
    private String ownerName;
    private String ownerEmail;
    private String ownerUsername; // Username for WebSocket notifications


 // Default constructor for JPA
    public FileMetaData() {
    }

    // Constructor with parameters
    public FileMetaData(String filename, String ownerName, String ownerEmail, String ownerUsername) {
        this.filename = filename;
        this.ownerName = ownerName;
        this.ownerEmail = ownerEmail;
        this.ownerUsername = ownerUsername;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getOwnerUsername() {
        return ownerUsername;
    }

    public void setOwnerUsername(String ownerUsername) {
        this.ownerUsername = ownerUsername;
    }
}
