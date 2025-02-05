package com.app.dev83.sistemaventas.Service;

import com.app.dev83.sistemaventas.Entity.OrdenVenta;
import com.app.dev83.sistemaventas.Entity.Usuario;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface OrdenVentaService {

    String registrar(Map<String, Object> requestMap);
    List<OrdenVenta> listar();
    void eliminar(Integer id);

    /*
    List<OrdenVenta> listarOrdenesVenta();
    void guardarOrdenVenta(OrdenVenta ordenVenta);
    OrdenVenta buscarPorId(Integer id);
    List<OrdenVenta> buscarPorFecha(String fecha);
    List<OrdenVenta> buscarPorUsuario(Usuario usuario);
    String generarNumeroOrdenVenta();
    */
}
