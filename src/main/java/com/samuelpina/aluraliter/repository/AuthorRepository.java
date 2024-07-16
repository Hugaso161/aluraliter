package com.samuelpina.aluraliter.repository;

import com.samuelpina.aluraliter.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    Optional<Author> findByNombreIgnoreCase(String nombre);

    Optional<Author> findByNombreContainsIgnoreCase(String nombre);

    @Query("SELECT a FROM Author a WHERE a.anoNasc < :ano AND a.anoMorte > :ano")
    Optional<List<Author>> cojerAutoresVivos(int ano);
}
