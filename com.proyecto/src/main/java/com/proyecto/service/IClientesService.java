
package com.proyecto.service;

import com.proyecto.entity.Clientes;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientesService {

public List<Clientes> getAllClientes();
public void createClientes(Clientes clientes);
public Clientes getClientesById(long id);
public void deleteClientes(long id);
public boolean existeClientesById(long id);

}