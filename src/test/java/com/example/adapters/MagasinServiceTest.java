package com.example.adapters;

import com.example.adapters.dto.MagasinDTO;
import com.example.adapters.service.MagasinService;
import com.example.domain.Magasin;
import io.smallrye.mutiny.Uni;
import io.smallrye.mutiny.Multi;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class MagasinServiceTest {

    @InjectMocks
    MagasinService magasinService;

    @Mock
    MagasinDTO magasinDTO;

    Magasin magasin;

    @BeforeEach
    void setUp() {
        magasin = new Magasin();
        magasin.setIdMagasin(1);
        magasin.setNom("Magasin Test");
        magasin.setLocalisation("Location Test");
        magasin.setOuverture(new Date());
    }

    @Test
    void testFindById() {
        when(magasinDTO.findMagasinById(1)).thenReturn(magasin);

        Uni<Magasin> result = magasinService.findById(1);

        Magasin resultMagasin = result.await().indefinitely();
        assertNotNull(resultMagasin);
        assertEquals(1, resultMagasin.getIdMagasin());
        assertEquals("Magasin Test", resultMagasin.getNom());

        verify(magasinDTO, times(1)).findMagasinById(1);
    }

    @Test
    void testFindByIdNotFound() {
        when(magasinDTO.findMagasinById(1)).thenReturn(null);

        Uni<Magasin> result = magasinService.findById(1);

        assertThrows(IllegalArgumentException.class, () -> result.await().indefinitely());

        verify(magasinDTO, times(1)).findMagasinById(1);
    }

    @Test
    void testFindAll() {
        when(magasinDTO.findAllMagasin()).thenReturn(Collections.singletonList(magasin));

        Multi<Magasin> result = magasinService.findAll();

        List<Magasin> resultList = result.collect().asList().await().indefinitely();
        assertNotNull(resultList);
        assertFalse(resultList.isEmpty());
        assertEquals(1, resultList.size());
        assertEquals("Magasin Test", resultList.get(0).getNom());

        verify(magasinDTO, times(1)).findAllMagasin();
    }

    @Test
    void testSave() {
        doNothing().when(magasinDTO).saveMagasin(magasin);

        Uni<Void> result = magasinService.save(magasin);

        result.await().indefinitely();
        verify(magasinDTO, times(1)).saveMagasin(magasin);
    }

    @Test
    void testUpdate() {
        doNothing().when(magasinDTO).updateMagasin(magasin);

        Uni<Void> result = magasinService.update(magasin);

        result.await().indefinitely();
        verify(magasinDTO, times(1)).updateMagasin(magasin);
    }

    @Test
    void testDelete() {
        when(magasinDTO.findMagasinById(1)).thenReturn(magasin);
        doNothing().when(magasinDTO).delete(magasin);

        Uni<Void> result = magasinService.delete(1);

        result.await().indefinitely();
        verify(magasinDTO, times(1)).findMagasinById(1);
        verify(magasinDTO, times(1)).delete(magasin);
    }

    @Test
    void testDeleteNotFound() {
        when(magasinDTO.findMagasinById(1)).thenReturn(null);

        Uni<Void> result = magasinService.delete(1);

        assertThrows(IllegalArgumentException.class, () -> result.await().indefinitely());
        verify(magasinDTO, times(1)).findMagasinById(1);
    }
}
