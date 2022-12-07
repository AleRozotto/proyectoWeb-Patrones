package com.proyectoTienda.DAO;

import com.proyectoTienda.domain.Carrito;
import org.springframework.data.repository.CrudRepository;

public interface CarritoDao extends CrudRepository<Carrito, Long>{
    
}
