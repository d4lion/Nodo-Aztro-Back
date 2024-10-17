package org.excersice_1.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @SuppressWarnings("deprecation")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    private Double total;

    // Relación ManyToOne: Muchas ventas pueden estar asociadas a un cliente
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    // Relación ManyToOne: Una venta puede tener muchos productos (lo cual puede ser ManyToMany si la venta involucra varios productos)
    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;
}
