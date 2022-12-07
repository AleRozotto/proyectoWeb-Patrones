package com.proyectoTienda.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cliente")
public class Articulo implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_Articulo")
    private Long ID_Articulo;
    private String Articulo;
    private String Talla;
    private Double Precio;
    private String Descripcion;
    private int Stock;
    
    @JoinColumn(name="ID_Categoria", referencedColumnName = "ID_Categoria")
    @OneToOne
    private Categoria categoria;
    
    public Articulo() {
    }

    public Articulo(String Articulo, String Talla, double Precio, String Descripcion, int Stock, Categoria categoria) {
        this.Articulo = Articulo;
        this.Talla = Talla;
        this.Precio = Precio;
        this.Descripcion = Descripcion;
        this.Stock = Stock;
        this.categoria = categoria;
    }

        
}
