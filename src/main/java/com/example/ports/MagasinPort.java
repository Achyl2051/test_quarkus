package com.example.ports;

import com.example.domain.Magasin;

import java.util.List;

public interface MagasinPort {
    public Magasin findById(int id);
    public List<Magasin> findAll();
    public void save(Magasin magasin);
    public void update(Magasin magasin);
    public void delete(int id);
}
