package com.proyecto.Category;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private CategoryRepository categoriasRepository;

    @Override
    public List<Category> getAllCategorias() {
        return (List<Category>) categoriasRepository.findAll();
    }

    @Override
    public void createCategorias(Category categorias) {
        categoriasRepository.save(categorias);
    }

    @Override
    public Category getCategoriasById(int id) {
        return categoriasRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteCategorias(int id) {
        categoriasRepository.deleteById(id);
    }

    @Override
    public boolean existeCategoriasById(int id) {
        return categoriasRepository.existsById(id);
    }

}
