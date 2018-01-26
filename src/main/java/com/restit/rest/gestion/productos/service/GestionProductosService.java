package com.restit.rest.gestion.productos.service;

import com.restit.rest.gestion.productos.domain.Mesa;
import com.restit.rest.gestion.productos.domain.RespuestaTransaccion;

public interface GestionProductosService {

    RespuestaTransaccion insertarMesas(Mesa mesa);
}
