package com.proyecto.service;

import com.proyecto.entity.Categorias;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ICategoriasService {

    public List<Categorias> getAllCategorias();

    public void createCategorias(Categorias categorias);

    public Categorias getCategoriasById(long id);

    public void deleteCategorias(long id);

    public boolean existeCategoriasById(long id);

}
