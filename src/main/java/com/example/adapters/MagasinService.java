package com.example.adapters;

import com.example.domain.Magasin;
import com.example.ports.MagasinPort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@ApplicationScoped
public class MagasinService implements MagasinPort {
    @PersistenceContext
    EntityManager em;

    @Override
    public Magasin findById(int idMagasin) {
        return em.find(Magasin.class,idMagasin);
    }
}
