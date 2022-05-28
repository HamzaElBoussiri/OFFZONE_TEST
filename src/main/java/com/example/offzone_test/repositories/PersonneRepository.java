package com.example.offzone_test.repositories;

import com.example.offzone_test.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface PersonneRepository extends JpaRepository<Personne,Long> {
    ArrayList<Personne> findPersonneById(Long id);
    ArrayList<Personne> findAll();
}
