package com.example.Fallapp.controller;

import com.example.Fallapp.model.Artista;
import com.example.Fallapp.model.Falla;
import com.example.Fallapp.repository.ArtistaRepository;
import com.example.Fallapp.repository.FallaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/artistas")
public class ArtistaController {

    private final ArtistaRepository artistaRepository;
    private final FallaRepository fallaRepository;

    public ArtistaController(ArtistaRepository artistaRepository, FallaRepository fallaRepository) {
        this.artistaRepository = artistaRepository;
        this.fallaRepository = fallaRepository;
    }

    @GetMapping
    public List<Artista> obtenerTodos() {
        return artistaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Artista> obtenerPorId(@PathVariable String id) {
        Optional<Artista> artista = artistaRepository.findById(id);
        return artista.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Artista crear(@RequestBody Artista artista) {
        return artistaRepository.save(artista);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Artista> actualizar(@PathVariable String id, @RequestBody Artista artista) {
        if (!artistaRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        artista.setId(id);
        Artista actualizado = artistaRepository.save(artista);
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable String id) {
        if (!artistaRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        artistaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/especialidad/{especialidad}")
    public List<Artista> obtenerPorEspecialidad(@PathVariable String especialidad) {
        return artistaRepository.findByEspecialidad(especialidad);
    }

    @GetMapping("/{id}/fallas")
    public List<Falla> obtenerFallasDeArtista(@PathVariable String id) {
        return fallaRepository.findByArtistaId(id);
    }
}

