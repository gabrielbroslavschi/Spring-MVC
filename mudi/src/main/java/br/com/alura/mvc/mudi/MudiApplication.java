package br.com.alura.mvc.mudi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"br.com.alura.mvc.model"})
@SpringBootApplication
public class MudiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MudiApplication.class, args);
	}

}
