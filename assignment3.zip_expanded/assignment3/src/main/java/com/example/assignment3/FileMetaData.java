package com.example.assignment3;

import jakarta.persistence.*;
@Entity
public class FileMetaData {

    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String filename;
    private int size;
    private String ownerName;
    private String ownerUsername; // Username for WebSocket notifications


 // Default constructor for JPA
    public FileMetaData() {
    }

    // Constructor with parameters
    public FileMetaData(String filename, String ownerName, int size, String ownerUsername) {
        this.filename = filename;
        this.ownerName = ownerName;
        this.size = size;
        this.ownerUsername = ownerUsername;
    }

    public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
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

    
    public String getOwnerUsername() {
        return ownerUsername;
    }

    public void setOwnerUsername(String ownerUsername) {
        this.ownerUsername = ownerUsername;
    }
}
