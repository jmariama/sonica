package com.github.jmariama.sonica;

import com.amilesend.discogs.Discogs;
import com.amilesend.discogs.api.DatabaseApi;
import com.amilesend.discogs.api.UserIdentityApi;
import com.amilesend.discogs.model.identity.type.AuthenticatedUser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;



@SpringBootApplication
public class SonicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SonicaApplication.class, args);
	}

	@Bean
	public Discogs discogsClient(@Value("${discogs.token}") String token) {
		System.out.println("token length: " + token.length());
		return Discogs.newTokenAuthenticatedInstance(token, "Sonica/1.0");
	}

	@Bean
	CommandLineRunner verifyDiscogs(Discogs client) {
		return args -> {
			AuthenticatedUser user = client.getUserIdentityApi().getAuthenticatedUser();
			System.out.println("Connected to Discogs as " + user.getUsername());
		};
	}
}

