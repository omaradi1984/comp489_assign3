package com.example.assignment3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FileSharingService {

	private static UserRepository userRepository;
	@Autowired
	private static FileMetadataRepository repository;

	@Autowired
	private static NotificationController notificationController;

	@Autowired
	public FileSharingService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public FileMetaData registerFile(FileMetaData fileMetadata) {
		return repository.save(fileMetadata);
	}

	public Optional<FileMetaData> searchFile(String filename) {
		return repository.findByFilename(filename);
	}

	public void removeFile(String filename, String username) {
		repository.deleteByFilename(filename, username);
	}

	public Optional<FileMetaData> getFileOwnerInfo(String filename) {
		return searchFile(filename);
	}

	public static void downloadFile(String filename, String requesterUsername) {
		// Find the file metadata by filename
		repository.findByFilename(filename).ifPresent(metadata -> {

			String requesterContactInfo = getRequesterContactInfo(requesterUsername);

			// Construct a message for the owner with the requester's contact info
			String message = String.format("User %s wants to download your file '%s'. Contact info: %s",
					requesterUsername, filename, requesterContactInfo);

			// Notify the owner via WebSocket using their username
			notificationController.notifyOwner(metadata.getOwnerUsername(), message);

		});
	}

	private static String getRequesterContactInfo(String requesterUsername) {
		return userRepository.findById(requesterUsername).map(user -> user.getContactInfo()).orElse("Unknown");
	}
}
