package br.com.netbook.configuration;

import java.io.FileInputStream;
import java.io.IOException;

import javax.validation.ValidationException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;

@Configuration
public class FirebaseConfig {

	@Bean
	public FirebaseAuth getFirebaseAuth() {
		try {
			FileInputStream serviceAccount = new FileInputStream("src/main/resources/serviceAccountKey.json");

			FirebaseOptions options = FirebaseOptions.builder()
					.setCredentials(GoogleCredentials.fromStream(serviceAccount)).build();

			return FirebaseAuth.getInstance(FirebaseApp.initializeApp(options));
		} catch (IOException e) {
			e.printStackTrace();
			throw new ValidationException("Could not initialize firebase.");
		}
	}

}
