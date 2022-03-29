package com.example.libreria.Servicios;

import com.example.libreria.Entidades.Autor;
import com.example.libreria.Repositorios.AutorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AutorServicio {

    @Autowired
    private AutorRepository autorRepository;


    @Transactional(readOnly = true)
    public List<Autor> listarTodos() {
        return autorRepository.findAll();
    }


@Transactional
    public void saveAutor(Autor autor)  {

        autorRepository.save(autor);
    }

/*
  @Transactional
   public void baja(Autor autor) {
     autorRepository.delete(autor);
    }
*/



}
