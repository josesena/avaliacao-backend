package br.com.backend.backendavaliacao;

import jakarta.servlet.MultipartConfigElement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.util.unit.DataSize;

@SpringBootApplication
public class BackendAvaliacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendAvaliacaoApplication.class, args);
	}

	@Bean
	MultipartConfigElement multipartConfigElement() {
		MultipartConfigFactory factory = new MultipartConfigFactory();
		factory.setMaxFileSize(DataSize.ofKilobytes(512));
		factory.setMaxRequestSize(DataSize.ofKilobytes(512));
		return factory.createMultipartConfig();
	}
}
