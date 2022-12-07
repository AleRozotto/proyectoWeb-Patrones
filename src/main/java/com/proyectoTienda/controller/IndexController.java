package com.proyectoTienda.controller;

import com.proyectoTienda.DAO.ClienteDao;
import com.proyectoTienda.Service.ArticuloService;
import com.proyectoTienda.Service.ClienteService;
import com.proyectoTienda.domain.Cliente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private ArticuloService articuloService;
    
    @GetMapping("/cliente/listado")
    public String inicio(Model model){
        var articulos = articuloService.getArticulos();
        model.addAttribute("articulos", articulos);
        return "/cliente/listado";
    }

}
