package com.samuelpina.aluraliter;

import com.samuelpina.aluraliter.principal.Principal;
import com.samuelpina.aluraliter.repository.AuthorRepository;
import com.samuelpina.aluraliter.repository.BookRepository;
import com.samuelpina.aluraliter.service.ConsumoApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;

@SpringBootApplication
public class AluraliterApplication implements CommandLineRunner {



	@Autowired
	BookRepository repository;
	@Autowired
	AuthorRepository repository2;
	public static void main(String[] args) {
		SpringApplication.run(AluraliterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal menu = new Principal(repository,repository2);
		menu.menu();
	}
}
