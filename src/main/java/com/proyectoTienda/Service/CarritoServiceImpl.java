package com.proyectoTienda.Service;

import com.proyectoTienda.DAO.ArticuloDao;
import com.proyectoTienda.DAO.CarritoDao;
import com.proyectoTienda.DAO.ClienteDao;
import com.proyectoTienda.Service.CarritoService;
import com.proyectoTienda.domain.Articulo;
import com.proyectoTienda.domain.Carrito;
import com.proyectoTienda.domain.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CarritoServiceImpl implements CarritoService{
    
    @Autowired
    private CarritoDao carritoDao;
    
    @Autowired
    private ArticuloDao articuloDao;
    
    @Autowired
    private ClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Carrito> getCarritos() {
        var lista = (List<Carrito>)carritoDao.findAll();
        return lista;
    }

    @Override
    @Transactional
    public void save(Carrito carrito) {
        Articulo articulo = carrito.getArticulo();
        articulo = articuloDao.save(articulo);
        carrito.setArticulo(articulo);

        Cliente cliente = carrito.getCliente();
        cliente = clienteDao.save(cliente);
        carrito.setCliente(cliente);

        carritoDao.save(carrito);
    }

    @Override
    @Transactional
    public void delete(Carrito carrito) {
        carritoDao.delete(carrito);
    }

    @Override
    @Transactional(readOnly = true)
    public Carrito getCarrito(Carrito carrito) {
        return carritoDao.findById(carrito.getID_Carrito()).orElse(null);
    }
}
