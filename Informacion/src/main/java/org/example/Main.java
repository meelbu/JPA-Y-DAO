package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenciaI");

        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();

        Persona persona = new Persona();
        persona.setNombre("Mariano");
        persona.setApellido("Martínez");
        persona.setEmail("mariano.mar@gmail.com");

        entityManager.persist(persona);

        entityManager.getTransaction().commit();

        entityManager.close();

    }
}