package com.proyectoTienda.Service;

import com.proyectoTienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    public List<Categoria> getCategorias();
    
    public void save(Categoria categoria);
    
    public void delete(Categoria categoria);
    
    public Categoria getCategoria(Categoria categoria);
    
}