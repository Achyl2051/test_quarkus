package com.example.adapters.service;

import com.example.adapters.dto.MagasinDTO;
import com.example.domain.Magasin;
import com.example.ports.MagasinPort;
import io.smallrye.mutiny.Uni;
import io.smallrye.mutiny.Multi;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class MagasinService implements MagasinPort {

    @Inject
    MagasinDTO magasinDTO;

    @Override
    public Uni<Magasin> findById(int idMagasin) {
        return Uni.createFrom().item(() -> magasinDTO.findMagasinById(idMagasin))
                .onItem().ifNull().failWith(() -> new IllegalArgumentException("Magasin with ID " + idMagasin + " not found"));
    }

    @Override
    public Multi<Magasin> findAll() {
        return Multi.createFrom().items(() -> magasinDTO.findAllMagasin().stream());
    }

    @Override
    @Transactional
    public Uni<Void> save(Magasin magasin) {
        return Uni.createFrom().voidItem()
                .onItem().invoke(() -> magasinDTO.saveMagasin(magasin));
    }

    @Override
    @Transactional
    public Uni<Void> update(Magasin magasin) {
        return Uni.createFrom().voidItem()
                .onItem().invoke(() -> magasinDTO.updateMagasin(magasin));
    }

    @Override
    @Transactional
    public Uni<Void> delete(int idMagasin) {
        return Uni.createFrom().voidItem()
                .onItem().invoke(() -> {
                    magasinDTO.delete(idMagasin);
                });
    }
}
