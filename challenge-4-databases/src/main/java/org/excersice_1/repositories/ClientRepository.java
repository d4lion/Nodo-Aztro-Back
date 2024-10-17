package org.excersice_1.repositories;

import org.excersice_1.configs.EntityManagerPostgres;
import org.excersice_1.models.Cliente;



public class ClientRepository {
    private final EntityManagerPostgres entityManagerPostgres;

    public ClientRepository() {
        entityManagerPostgres = new EntityManagerPostgres();
    }

    public void guardarCliente(Cliente cliente) {
        entityManagerPostgres.getEntityManager().getTransaction().begin();
        entityManagerPostgres.getEntityManager().persist(cliente);
        entityManagerPostgres.getEntityManager().getTransaction().commit();
        entityManagerPostgres.getEntityManager().close();
    }

    public Cliente encontrarClientePorId(Long id) {
        Cliente cliente = entityManagerPostgres.getEntityManager().find(Cliente.class, id);
        entityManagerPostgres.getEntityManager().close();
        return cliente;
    }
}
