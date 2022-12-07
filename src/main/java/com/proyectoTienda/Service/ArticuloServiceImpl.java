package com.proyectoTienda.Service;

import com.proyectoTienda.DAO.ArticuloDao;
import com.proyectoTienda.DAO.CategoriaDao;
import com.proyectoTienda.Service.ArticuloService;
import com.proyectoTienda.domain.Articulo;
import com.proyectoTienda.domain.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArticuloServiceImpl implements ArticuloService{
    
    @Autowired
    private ArticuloDao articuloDao;
    
    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Articulo> getArticulos() {
        var lista = (List<Articulo>)articuloDao.findAll();
        return lista;
    }

    @Override
    @Transactional
    public void save(Articulo articulo) {
        Categoria categoria = articulo.getCategoria();
        categoria = categoriaDao.save(categoria);
        articulo.setCategoria(categoria);
        articuloDao.save(articulo);
    }

    @Override
    @Transactional
    public void delete(Articulo articulo) {
        articuloDao.delete(articulo);
    }

    @Override
    @Transactional(readOnly = true)
    public Articulo getArticulo(Articulo articulo) {
        return articuloDao.findById(articulo.getID_Articulo()).orElse(null);
    }
}
