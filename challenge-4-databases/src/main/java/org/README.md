# 🧠Ejercicio de JPA e Hibernate para la creacion de tablas
Se construyerón haciendo suo de las librerias:
- JPA  [(Java Persistance Api)](https://www.ibm.com/docs/es/was-liberty/nd?topic=liberty-java-persistence-api-jpa).
- Hibernate ORM [(Object Relational Mapping)](https://hibernate.org/orm/).
- Postgres [Database](https://www.postgresql.org/).

## ✈ Proceso
Se realizó una separación por capas en donde cada clase y su respectivo repositorio
definian la manera en la cual se trabajarían los diferentes metodos de las clases para
realizar la interaccion con la base de datos:

### Cliente
Para el caso de cliente existe la posibilidad de añadir un cliente a la base de datos 
como tambien la posibilidad de encontrar alguno por medio de su ID:

```java
public Cliente encontrarClientePorId(Long id) {  
	  Cliente cliente = entityManagerPostgres.getEntityManager().find(Cliente.class, id);  
    entityManagerPostgres.getEntityManager().close();  
    return cliente;  
}
```
## 🌏 Relaciones
Para este ejercicio tambien se definieron diferentes tipos de relaciones, las cuales
no ayudan transformar la base de datos, mejorando su forma normal evitando datos repetitivos y
redudantes:

![image](https://github.com/user-attachments/assets/77270cb0-9dad-45e0-bff7-1dcd6a589304)
