package com.techlab.trabajo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository repo;

    public List<Producto> listar() {
        return repo.findAll();
    }

    public Optional<Producto> buscarPorId(Long id) {
        return repo.findById(id);
    }

    public Producto guardar(Producto p) {
        if (p.getPrecio() < 0 || p.getStock() < 0) {
            throw new IllegalArgumentException("Precio y stock deben ser >= 0");
        }
        return repo.save(p);
    }

    public Producto actualizar(Long id, Producto datos) {
        return repo.findById(id).map(p -> {
            if (datos.getPrecio() != null && datos.getPrecio() >= 0) p.setPrecio(datos.getPrecio());
            if (datos.getStock() != null && datos.getStock() >= 0) p.setStock(datos.getStock());
            return repo.save(p);
        }).orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
