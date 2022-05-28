package com.example.offzone_test.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data @AllArgsConstructor
@NoArgsConstructor
public class Personne {
    //Créer un model ( ID, Nom, Prenom, age)
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nom;
    String prenom;
    Integer age;


}
