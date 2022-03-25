package com.proyecto.service;

import com.proyecto.entity.Clientes;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IClientesService {

    public List<Clientes> getAllClientes();

    public void createClientes(Clientes clientes);

    public Clientes getClientesById(int id);

    public void deleteClientes(int id);

    public boolean existeClientesById(int id);

}
