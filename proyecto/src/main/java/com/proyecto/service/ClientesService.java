package com.proyecto.service;

import com.proyecto.entity.Clientes;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyecto.repository.ClientesRepository;

@Service
public class ClientesService implements IClientesService {

    @Autowired
    private ClientesRepository clientesRepository;


    @Override
    public List<Clientes> getAllClientes() {
        return (List<Clientes>) clientesRepository.findAll();
    }

    @Override
    public void createClientes(Clientes clientes) {
         clientesRepository.save(clientes);
    }

    @Override
    public Clientes getClientesById(long id) {
        return clientesRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteClientes(long id) {
        clientesRepository.deleteById(id);
    }

    @Override
    public boolean existeClientesById(long id) {
        return clientesRepository.existsById(id);
    }
    
}
