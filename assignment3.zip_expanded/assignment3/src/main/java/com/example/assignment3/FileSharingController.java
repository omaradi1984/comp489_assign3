package com.example.assignment3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/files")
public class FileSharingController {

    @Autowired
    private FileSharingService service;

    @PostMapping("/register")
    public FileMetaData registerFile(@RequestBody FileMetaData fileMetadata) {
        return service.registerFile(fileMetadata);
    }

    @GetMapping("/search/{filename}")
    public Optional<FileMetaData> searchFile(@PathVariable String filename) {
        return service.searchFile(filename);
    }

    @DeleteMapping("/remove/{filename}")
    public void removeFile(@PathVariable String filename, @RequestParam String username) {
        service.removeFile(filename, username);
    }

    @GetMapping("/owner/{filename}")
    public Optional<FileMetaData> getFileOwnerInfo(@PathVariable String filename) {
        return service.getFileOwnerInfo(filename);
    }

    @GetMapping("/download/{filename}")
    public String downloadFile(@PathVariable String filename, @RequestParam String requesterUsername) {
        FileSharingService.downloadFile(filename, requesterUsername);
        return "Request to download " + filename + " by " + requesterUsername + " has been processed.";
    }
}
