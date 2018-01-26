package com.restit.rest.gestion.productos.web.controller;


import com.restit.rest.gestion.productos.domain.Estadisticas;
import com.restit.rest.gestion.productos.domain.Prueba;
import com.restit.rest.gestion.productos.domain.TotalMaterial;
import com.restit.rest.gestion.productos.service.ConsultasEstadisticas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/consutas")
public class ConsultasProductos {


    @Autowired
    ConsultasEstadisticas consultasEstadisticas;

    @RequestMapping(value = "/estadisticas", method = RequestMethod.GET)
    public Estadisticas obtenerEstadisticas(){

        return consultasEstadisticas.consultarEstadisticasMesas();



    }

    @RequestMapping(value = "/prueba", method = RequestMethod.GET)
    public Prueba obtenerJsonPrueba(){
        TotalMaterial totalMaterial = new TotalMaterial();
        totalMaterial.setCantidad(333);
        totalMaterial.setModelo("modelo");
        totalMaterial.setMaterial("madera");
        List<TotalMaterial> totalMaterialList = new ArrayList<>();
        totalMaterialList.add(totalMaterial);
        totalMaterialList.add(totalMaterial);
        totalMaterialList.add(totalMaterial);
        Prueba prueba = new Prueba();
        prueba.setCodigo(0);
        prueba.setDescripcion("rafi");
        prueba.setTotalMaterialList(totalMaterialList);

        return prueba;



    }

}
