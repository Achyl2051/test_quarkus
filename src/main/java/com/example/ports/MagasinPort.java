package com.example.ports;

import com.example.domain.Magasin;
import io.smallrye.mutiny.Uni;
import io.smallrye.mutiny.Multi;

public interface MagasinPort {
    Uni<Magasin> findById(int id);
    Multi<Magasin> findAll();
    Uni<Void> save(Magasin magasin);
    Uni<Void> update(Magasin magasin);
    Uni<Void> delete(int id);
}
