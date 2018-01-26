package com.restit.rest.gestion.productos.service.impl;

import com.restit.rest.gestion.productos.dao.InsercionProductosDAO;
import com.restit.rest.gestion.productos.domain.Mesa;
import com.restit.rest.gestion.productos.domain.RespuestaTransaccion;
import com.restit.rest.gestion.productos.service.GestionProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GestionProductosServiceImpl implements GestionProductosService {

    @Autowired
    InsercionProductosDAO insercionProductosDAO;

    @Override
    public RespuestaTransaccion insertarMesas(Mesa mesa){
        RespuestaTransaccion respuestaTransaccion = new RespuestaTransaccion();
        insercionProductosDAO.insertarMesas(mesa);

        respuestaTransaccion.setDescripcion("Transaccion Exitosa");
        respuestaTransaccion.setCodigo(0);
        return respuestaTransaccion;

    }
}
