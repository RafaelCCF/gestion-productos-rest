package com.restit.rest.gestion.productos.service.impl;

import com.restit.rest.gestion.productos.dao.ConsultasMesasDAO;
import com.restit.rest.gestion.productos.domain.Estadisticas;
import com.restit.rest.gestion.productos.domain.TotalMaterial;
import com.restit.rest.gestion.productos.service.ConsultasEstadisticas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ConsultasEstadisticasImpl implements ConsultasEstadisticas {

    @Autowired
    ConsultasMesasDAO consultasMesasDAO;

    @Override
    public Estadisticas consultarEstadisticasMesas(){
        Integer cantidadMesas = consultasMesasDAO.consultarCantidadMesas();
        Integer cantidadVentas = consultasMesasDAO.consultarCantidadVentas();
        BigDecimal ingresosVentas = consultasMesasDAO.consultarGananciasVentas();
        BigDecimal inversionRealizada = consultasMesasDAO.consultarInversionRealizada();
        BigDecimal gananciaNeta = ingresosVentas.subtract(inversionRealizada);
        Integer mesasVendidasPorAnio = consultasMesasDAO.consultarMesasVendidasPorAño("'2017-12-31'");
        Integer mesasCompradasPorAnio = consultasMesasDAO.consultarMesasCompradasPorAño("'2017-12-31'");


        List<TotalMaterial> materialMasCompradoList = consultasMesasDAO.consultarMaterialMasComprado();
        List<TotalMaterial> materialMasVendidoList = consultasMesasDAO.consultarMaterialMasVendido();
        List<TotalMaterial> mesasCompradasList = consultasMesasDAO.consultarMesasCompradas();
        List<TotalMaterial> mesasVendidasList = consultasMesasDAO.consultarMesasVendidas();

        Estadisticas estadisticas = new Estadisticas();
        estadisticas.setCantidadMesas(cantidadMesas);
        estadisticas.setCantidadVentas(cantidadVentas);
        estadisticas.setIngresosVentas(ingresosVentas);
        estadisticas.setInversionRealizada(inversionRealizada);
        estadisticas.setGananciaNeta(gananciaNeta);
        estadisticas.setTotalComprasAnio(mesasCompradasPorAnio);
        estadisticas.setTotalVentasAnio(mesasVendidasPorAnio);
        estadisticas.setCantidadMesasCompradas(mesasCompradasList);
        estadisticas.setCantidadMesasVendidas(mesasVendidasList);
        estadisticas.setMaterialesMasComprados(materialMasCompradoList);
        estadisticas.setMaterialesMasVendidos(materialMasVendidoList);
        return estadisticas;
    }
}
