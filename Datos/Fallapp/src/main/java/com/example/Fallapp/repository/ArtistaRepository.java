package com.example.Fallapp.repository;

import com.example.Fallapp.model.Artista;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ArtistaRepository extends MongoRepository<Artista, String> {

    List<Artista> findByNombre(String nombre);

    List<Artista> findByEspecialidad(String especialidad);
}

