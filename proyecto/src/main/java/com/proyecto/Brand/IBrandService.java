package com.proyecto.Brand;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IBrandService {

    public List<Brand> getAllMarca();

    public void createMarca(Brand categorias);

    public Brand getMarcaById(int id);

    public void deleteMarca(int id);

    public boolean existeMarcaById(int id);

}
