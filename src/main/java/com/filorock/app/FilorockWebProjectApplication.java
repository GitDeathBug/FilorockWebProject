package com.filorock.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.filorock.app.service.UploadFiles;

@SpringBootApplication
public class FilorockWebProjectApplication implements CommandLineRunner {

	@Autowired
	UploadFiles uploadFileService;

	public static void main(String[] args) {
		SpringApplication.run(FilorockWebProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		uploadFileService.deleteAll();
		uploadFileService.init();
	}
}