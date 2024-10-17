package org.excersice_1.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Double precio;

    // Relación ManyToOne: Un producto pertenece a una marca
    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca;
}
