package com.example.libreria.Repositorios;

import com.example.libreria.Entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AutorRepository extends JpaRepository<Autor, Long> {


/*
@Query("DELETE FROM libreria.autor WHERE id like %:id%")
 public List<Autor>searchNativo(@Param("id") Long id);

*/





}