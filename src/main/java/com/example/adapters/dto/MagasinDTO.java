package com.example.adapters.dto;

import com.example.domain.Magasin;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
@Transactional
public class MagasinDTO implements PanacheRepository<Magasin> {
    public Magasin findMagasinById(int id) {
        return find("id", id).firstResult();
    }

    public List<Magasin> findAllMagasin()  {
        return listAll();
    }

    public void saveMagasin(Magasin magasin) {
        persist(magasin);
    }

    public void delete(int idMagasin) {
        Magasin magasin = findMagasinById(idMagasin);
        delete(magasin);
    }

    public void updateMagasin(Magasin magasin) {
        Magasin magasin1= findMagasinById(magasin.getIdMagasin());
        magasin1.setNom(magasin.getNom());
        magasin1.setLocalisation(magasin.getLocalisation());
        magasin1.setOuverture(magasin.getOuverture());
        persist(magasin1);
    }
}
