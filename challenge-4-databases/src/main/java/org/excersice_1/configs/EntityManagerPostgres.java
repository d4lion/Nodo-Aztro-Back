package org.excersice_1.configs;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import lombok.Getter;


public class EntityManagerPostgres {
    @Getter
    private final EntityManagerFactory entityManagerFactory;

    @Getter
    private final EntityManager entityManager;

    public EntityManagerPostgres() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("supermercadoPU");
        this.entityManager = entityManagerFactory.createEntityManager();
    }



}
