package com.example.adapters.service;

import com.example.domain.Magasin;
import com.example.ports.MagasinPort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class MagasinService implements MagasinPort {
    @PersistenceContext
    EntityManager em;

    @Override
    public Magasin findById(int idMagasin) {
        Magasin magasin =em.find(Magasin.class,idMagasin);
        if(magasin!=null)
        {
            return magasin;
        }
        else {
            throw new IllegalArgumentException("Magasin with ID " + idMagasin + " not found");
        }
    }

    public List<Magasin> findAll() {
        return em.createNativeQuery("select * from magasin", Magasin.class).getResultList();
    }


    @Override
    public void save(Magasin magasin) {
        em.persist(magasin);
    }

    @Override
    @Transactional
    public void update(Magasin magasin) {
        em.merge(magasin);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Magasin magasin = em.find(Magasin.class, id);
        if (magasin != null) {
            em.remove(magasin);
        } else {
            throw new IllegalArgumentException("Magasin with ID " + id + " not found");
        }
    }
}
