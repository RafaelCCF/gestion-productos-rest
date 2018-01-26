package com.restit.rest.gestion.productos.web.controller;

import com.restit.rest.gestion.productos.domain.Mesa;
import com.restit.rest.gestion.productos.domain.RespuestaTransaccion;
import com.restit.rest.gestion.productos.service.GestionProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/gestion")
public class GestionProductos {

    @Autowired
    GestionProductosService gestionProductosService;

    @RequestMapping(value = "/insercion-mesa", method = RequestMethod.PUT)
    public RespuestaTransaccion insertarMesas(@RequestBody Mesa mesa){

        return gestionProductosService.insertarMesas(mesa);



    }


}
