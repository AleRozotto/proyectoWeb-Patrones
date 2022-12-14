package com.proyectoTienda.Service;

import com.proyectoTienda.domain.Cliente;
import java.util.List;

public interface ClienteService {
    public List<Cliente> getCliente();
    
    public void save(Cliente cliente);
    
    public void delete(Cliente cliente);
    
    public Cliente getCliente(Cliente cliente);
    
}
