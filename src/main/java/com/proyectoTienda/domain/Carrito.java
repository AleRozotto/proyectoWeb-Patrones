package com.proyectoTienda.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "carrito")
public class Carrito implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_Carrito")
    private Long ID_Carrito;
    private int Cantidad;
    private Double Pagar;
    
    @JoinColumn(name="ID_Cliente", referencedColumnName = "ID_Cliente")
    @ManyToOne
    private Cliente cliente;
    
    @JoinColumn(name="ID_Articulo", referencedColumnName = "ID_Articulo")
    @ManyToOne
    private Articulo articulo;
    

    public Carrito() {
    }

    public Carrito(int Cantidad, double Pagar, Cliente cliente, Articulo articulo) {
        this.Cantidad = Cantidad;
        this.Pagar = Pagar;
        this.cliente = cliente;
        this.articulo = articulo;
    }
        
}
