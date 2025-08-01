package com.techlab.trabajo;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<LineaPedido> lineas = new ArrayList<>();

    private String estado; // pendiente, confirmado, enviado, entregado, cancelado

    public Pedido() {
        this.estado = "pendiente";
    }

    public Long getId() { return id; }

    public List<LineaPedido> getLineas() { return lineas; }
    public void setLineas(List<LineaPedido> lineas) { this.lineas = lineas; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public double calcularTotal() {
        return lineas.stream()
                .mapToDouble(lp -> lp.getCantidad() * lp.getProducto().getPrecio())
                .sum();
    }
}
