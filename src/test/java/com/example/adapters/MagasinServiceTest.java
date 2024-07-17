package com.example.adapters;

import com.example.adapters.service.MagasinService;
import com.example.domain.Magasin;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith({MockitoExtension.class})
class MagasinServiceTest extends MagasinService {

    @Mock
    EntityManager entityManager;

    @InjectMocks
    MagasinService magasinService;

    @Captor
    ArgumentCaptor<Magasin> magasinCaptor;

    private List<Magasin> magasins;
    private Magasin magasin1;

    @BeforeEach
    void setUp() {
        magasins = new ArrayList<>();
        magasin1 = new Magasin();
        magasin1.setIdMagasin(1);
        magasin1.setNom("First");

        Magasin magasin2 = new Magasin();
        magasin2.setIdMagasin(2);
        magasin2.setNom("Second");

        magasins.add(magasin1);
        magasins.add(magasin2);
    }

    @Test
    void testFindById() {
        when(entityManager.find(Magasin.class, 1)).thenReturn(magasin1);

        Magasin foundMagasin = magasinService.findById(1);

        assertEquals(1, foundMagasin.getIdMagasin());
        assertEquals("First", foundMagasin.getNom());
    }

    @Test
    void testFindAll() {
        Query queryMock = mock(Query.class);
        when(entityManager.createNativeQuery("select * from magasin",Magasin.class)).thenReturn(queryMock);
        when(queryMock.getResultList()).thenReturn(magasins);

        List<Magasin> result = magasinService.findAll();
        assertEquals(2, result.size());
        assertEquals("First", result.get(0).getNom());
        assertEquals("Second", result.get(1).getNom());
    }

    @Test
    void testSave() {
        Magasin magasin = new Magasin();
        magasin.setNom("Magasin test");
        magasin.setLocalisation("Localisation test");
        magasinService.save(magasin);

        verify(entityManager).persist(magasinCaptor.capture());
        Magasin capturedMagasin = magasinCaptor.getValue();
        assertEquals("Magasin test", capturedMagasin.getNom());
        assertEquals("Localisation test", capturedMagasin.getLocalisation());
    }

    @Test
    void testUpdate() {
        magasinService.update(magasin1);

        verify(entityManager).merge(magasinCaptor.capture());
        Magasin capturedMagasin = magasinCaptor.getValue();
        assertEquals(1, capturedMagasin.getIdMagasin());
        assertEquals("First", capturedMagasin.getNom());
    }

    @Test
    void testDelete() {
        int idMagasin = 1;
        when(entityManager.find(Magasin.class, idMagasin)).thenReturn(magasin1);

        magasinService.delete(idMagasin);
        verify(entityManager).remove(magasin1);
    }
}