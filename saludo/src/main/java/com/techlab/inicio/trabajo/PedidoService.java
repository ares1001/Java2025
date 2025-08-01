package com.techlab.trabajo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepo;

    @Autowired
    private ProductoRepository productoRepo;

    @Transactional
    public Pedido crearPedido(Pedido pedido) {
        // Validar stock
        for (LineaPedido linea : pedido.getLineas()) {
            Producto producto = productoRepo.findById(linea.getProducto().getId())
                    .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

            if (producto.getStock() < linea.getCantidad()) {
                throw new StockInsuficienteException("Stock insuficiente para producto: " + producto.getNombre());
            }
        }

        // Descontar stock
        for (LineaPedido linea : pedido.getLineas()) {
            Producto producto = productoRepo.findById(linea.getProducto().getId()).get();
            producto.setStock(producto.getStock() - linea.getCantidad());
            productoRepo.save(producto);
        }

        pedido.setEstado("pendiente");
        return pedidoRepo.save(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepo.findAll();
    }

    public Pedido cambiarEstado(Long id, String nuevoEstado) {
        Pedido pedido = pedidoRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido no encontrado"));
        pedido.setEstado(nuevoEstado);
        return pedidoRepo.save(pedido);
    }
}
