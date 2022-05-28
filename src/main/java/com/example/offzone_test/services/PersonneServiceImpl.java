package com.example.offzone_test.services;

import com.example.offzone_test.entities.Personne;
import com.example.offzone_test.repositories.PersonneRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class PersonneServiceImpl implements PersonneService{
    PersonneRepository personneRepository;
    @Override
    public List<Personne> getPersonnes() {
        List<Personne> modelList = personneRepository.findAll();
        return modelList;
    }

    @Override
    public List<Personne> getPersonnesById(Long id) {
        List<Personne> modelListById=personneRepository.findPersonneById(id);

        return modelListById;
    }
    @Override
    public Personne savePersonne(Personne personne) {
        log.info("Saving new Customer ");
        Personne savedPersonne = personneRepository.save(personne);
        return savedPersonne;
    }
}
