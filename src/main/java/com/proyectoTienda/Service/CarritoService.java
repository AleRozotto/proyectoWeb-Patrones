package com.proyectoTienda.Service;

import com.proyectoTienda.domain.Carrito;
import java.util.List;

public interface CarritoService {
    public List<Carrito> getCarritos();
    
    public void save(Carrito carrito);
    
    public void delete(Carrito carrito);
    
    public Carrito getCarrito(Carrito carrito);
    
}
