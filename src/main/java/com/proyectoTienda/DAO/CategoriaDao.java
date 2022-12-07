package com.proyectoTienda.DAO;

import com.proyectoTienda.domain.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaDao extends CrudRepository<Categoria, Long>{
    
}
