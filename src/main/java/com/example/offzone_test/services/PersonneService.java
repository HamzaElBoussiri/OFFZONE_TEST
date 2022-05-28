package com.example.offzone_test.services;

import com.example.offzone_test.entities.Personne;

import java.util.List;

public interface PersonneService {
    List<Personne> getPersonnes();
    List<Personne> getPersonnesById(Long id);
    Personne savePersonne(Personne personne);
}
