package com.proyecto.service;

import com.proyecto.entity.Marca;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyecto.repository.MarcaRepository;

@Service
public class MarcaService implements IMarcaService {

    @Autowired
    private MarcaRepository marcaRepository;

    @Override
    public List<Marca> getAllMarca() {
        return (List<Marca>) marcaRepository.findAll();
    }

    @Override
    public void createMarca(Marca categorias) {
        marcaRepository.save(categorias);
    }

    @Override
    public Marca getMarcaById(long id) {
        return marcaRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteMarca(long id) {
        marcaRepository.deleteById(id);
    }

    @Override
    public boolean existeMarcaById(long id) {
        return marcaRepository.existsById(id);
    }

}
