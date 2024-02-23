package com.example.assignment3;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FileMetadataRepository extends JpaRepository<FileMetaData, Long> {
    Optional<FileMetaData> findByFilename(String filename);
    void deleteByFilename(String filename, String username);
}
