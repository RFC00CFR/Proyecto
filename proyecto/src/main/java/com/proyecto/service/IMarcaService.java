package com.proyecto.service;

import com.proyecto.entity.Marca;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IMarcaService {

    public List<Marca> getAllMarca();

    public void createMarca(Marca categorias);

    public Marca getMarcaById(long id);

    public void deleteMarca(long id);

    public boolean existeMarcaById(long id);

}
