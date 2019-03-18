package br.edu.unifcv2.Faculdade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.unifcv2.Faculdade.bootstrap.DataLoader;

@SpringBootApplication
public class FaculdadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FaculdadeApplication.class, args);
		DataLoader dt = new DataLoader();
		
		try {
			dt.run(null);	
		} catch (Exception e) {
			System.out.print(e.toString());
		}

	}

}
