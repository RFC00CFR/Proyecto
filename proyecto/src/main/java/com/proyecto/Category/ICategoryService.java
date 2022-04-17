package com.proyecto.Category;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ICategoryService {

    public List<Category> getAllCategorias();

    public void createCategorias(Category categorias);

    public Category getCategoriasById(int id);

    public void deleteCategorias(int id);

    public boolean existeCategoriasById(int id);

}
