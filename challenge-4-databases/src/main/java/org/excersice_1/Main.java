package org.excersice_1;

import org.excersice_1.configs.EntityManagerPostgres;
import org.excersice_1.models.Cliente;
import org.excersice_1.models.Marca;
import org.excersice_1.models.Producto;
import org.excersice_1.models.Venta;

import java.util.Date;

public class Main {
    public static void main(String... args) {
        EntityManagerPostgres entityManagerPostgres = new EntityManagerPostgres();



        // Iniciar una transacción
        entityManagerPostgres.getEntityManager().getTransaction().begin();

        // Crear y persistir una marca
        Marca marca = new Marca();
        marca.setNombre("Marca A");
        entityManagerPostgres.getEntityManager().persist(marca);

        // Crear y persistir un producto
        Producto producto = new Producto();
        producto.setNombre("Producto B");
        producto.setPrecio(100.0);
        producto.setMarca(marca);
        entityManagerPostgres.getEntityManager().persist(producto);

        // Crear y persistir un cliente
        Cliente cliente = new Cliente();
        cliente.setNombre("Daniel Martinez");
        cliente.setDireccion("Calle Colombia 123");
        entityManagerPostgres.getEntityManager().persist(cliente);

        // Crear y persistir una venta
        Venta venta = new Venta();
        venta.setFecha(new Date());
        venta.setTotal(100.0);
        venta.setCliente(cliente);
        venta.setProducto(producto);
        entityManagerPostgres.getEntityManager().persist(venta);

        // Confirmar la transacción
        entityManagerPostgres.getEntityManager().getTransaction().commit();

        // Consultar las ventas del cliente
        Cliente clienteConsultado = entityManagerPostgres.getEntityManager().find(Cliente.class, cliente.getId());
        System.out.println("Ventas realizadas por " + clienteConsultado.getNombre() + ":");
        for (Venta v : clienteConsultado.getVentas()) {
            System.out.println("Fecha: " + v.getFecha() + ", Total: " + v.getTotal() + ", Producto: " + v.getProducto().getNombre());
        }

        entityManagerPostgres.getEntityManager().close();
        entityManagerPostgres.getEntityManager().close();
    }
}
