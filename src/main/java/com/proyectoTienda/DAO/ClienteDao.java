package com.proyectoTienda.DAO;

import com.proyectoTienda.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Long>{
    
}
