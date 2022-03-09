package com.proyecto.service;

import com.proyecto.entity.Categorias;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyecto.repository.CategoriasRepository;

@Service
public class CategoriasService implements ICategoriasService {

    @Autowired
    private CategoriasRepository categoriasRepository;


    @Override
    public List<Categorias> getAllCategorias() {
        return (List<Categorias>) categoriasRepository.findAll();
    }

    @Override
    public void createCategorias(Categorias categorias) {
        categoriasRepository.save(categorias);
    }

    @Override
    public Categorias getCategoriasById(long id) {
        return categoriasRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteCategorias(long id) {
        categoriasRepository.deleteById(id);
    }

    @Override
    public boolean existeCategoriasById(long id) {
        return categoriasRepository.existsById(id);
    }
    
}
