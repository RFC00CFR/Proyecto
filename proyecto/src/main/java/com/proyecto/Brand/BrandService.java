package com.proyecto.Brand;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class BrandService implements IBrandService {

    @Autowired
    private BrandRepository marcaRepository;

    @Override
    public List<Brand> getAllMarca() {
        return (List<Brand>) marcaRepository.findAll();
    }

    @Override
    public void createMarca(Brand categorias) {
        marcaRepository.save(categorias);
    }

    @Override
    public Brand getMarcaById(int id) {
        return marcaRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteMarca(int id) {
        marcaRepository.deleteById(id);
    }

    @Override
    public boolean existeMarcaById(int id) {
        return marcaRepository.existsById(id);
    }

}
