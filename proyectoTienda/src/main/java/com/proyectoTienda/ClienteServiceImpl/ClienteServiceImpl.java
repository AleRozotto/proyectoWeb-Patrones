package com.proyectoTienda.ClienteServiceImpl;

import com.proyectoTienda.DAO.ClienteDao;
import com.proyectoTienda.Service.ClienteService;
import com.proyectoTienda.domain.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteDao clienteDao;

    @Override
    public List<Cliente> getCliente() {
        var lista = (List<Cliente>)clienteDao.findAll();
        return lista;
    }

    @Override
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }

    @Override
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente());
    }
    
}
