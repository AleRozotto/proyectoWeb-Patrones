package com.proyectoTienda.controller;

import com.proyectoTienda.DAO.CarritoDao;
import com.proyectoTienda.Service.CarritoService;
import com.proyectoTienda.domain.Carrito;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class CarritoController {
    
    @Autowired
    private CarritoService carritoService;
    
    @GetMapping("/carrito/listado")
    public String inicio(Model model){
        var carritos = carritoService.getCarritos();
        model.addAttribute("carritos", carritos);
        return "/carrito/listado";
    }
    
    @GetMapping("/carrito/nuevo")
    public String nuevoCarrito(Carrito carrito){
        return "/carrito/modificar";
    }
    
    @PostMapping("/carrito/guardar")
    public String guardarCarrito(Carrito carrito){
        carritoService.save(carrito);
        return "redirect:/carrito/listado";
    }
    
    @GetMapping("/carrito/modificar/{ID_Carrito}")
    public String modificarCarrito(Carrito carrito, Model model){
        carrito = carritoService.getCarrito(carrito);
        model.addAttribute("carrito",carrito);
        return "/carrito/modificar";
    }

    @GetMapping("/carrito/eliminar/{ID_Carrito}")
    public String eliminarCarrito(Carrito carrito) {
        carritoService.delete(carrito);
        return "redirect:/carrito/listado";
    }

}
