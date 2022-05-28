package com.example.offzone_test;

import com.example.offzone_test.entities.Personne;
import com.example.offzone_test.repositories.PersonneRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OffzoneTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(OffzoneTestApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PersonneRepository personneRepository ){
        return args -> {
            personneRepository.save(
                    new Personne(null,"Hamza","HAMZA",18));
            personneRepository.save(
                    new Personne(null,"Anwar","ANWAR",26));
            personneRepository.save(
                    new Personne(null,"Sanae","SANAE",19));
            personneRepository.save(
                    new Personne(null,"Nada","NADA",22));


            personneRepository.findAll().forEach(m->{
                System.out.println(m.getNom());
            });
        };
    }

}
