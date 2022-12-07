package com.proyectoTienda.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "categoria")
public class Categoria implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_Categoria")
    private Long ID_Categoria;
    private String Cat;

    public Categoria() {
    }

    public Categoria(String Categoria) {
        this.Cat = Cat;
    }

    
    
    
}
