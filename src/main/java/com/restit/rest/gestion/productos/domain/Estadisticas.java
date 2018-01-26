package com.restit.rest.gestion.productos.domain;

import java.math.BigDecimal;
import java.util.List;

public class Estadisticas {
    Integer cantidadMesas;
    Integer cantidadVentas;
    List<TotalMaterial> cantidadMesasVendidas;
    List<TotalMaterial> cantidadMesasCompradas;
    List<TotalMaterial> materialesMasComprados;
    List<TotalMaterial> materialesMasVendidos;
    Integer totalComprasAnio;
    Integer totalVentasAnio;
    BigDecimal ingresosVentas;
    BigDecimal inversionRealizada;
    BigDecimal gananciaNeta;

    public BigDecimal getIngresosVentas() {
        return ingresosVentas;
    }

    public void setIngresosVentas(BigDecimal ingresosVentas) {
        this.ingresosVentas = ingresosVentas;
    }

    public BigDecimal getGananciaNeta() {
        return gananciaNeta;
    }

    public void setGananciaNeta(BigDecimal gananciaNeta) {
        this.gananciaNeta = gananciaNeta;
    }

    public Integer getCantidadMesas() {
        return cantidadMesas;
    }

    public void setCantidadMesas(Integer cantidadMesas) {
        this.cantidadMesas = cantidadMesas;
    }

    public Integer getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(Integer cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    public List<TotalMaterial> getCantidadMesasVendidas() {
        return cantidadMesasVendidas;
    }

    public void setCantidadMesasVendidas(List<TotalMaterial> cantidadMesasVendidas) {
        this.cantidadMesasVendidas = cantidadMesasVendidas;
    }

    public List<TotalMaterial> getCantidadMesasCompradas() {
        return cantidadMesasCompradas;
    }

    public void setCantidadMesasCompradas(List<TotalMaterial> cantidadMesasCompradas) {
        this.cantidadMesasCompradas = cantidadMesasCompradas;
    }

    public List<TotalMaterial> getMaterialesMasComprados() {
        return materialesMasComprados;
    }

    public void setMaterialesMasComprados(List<TotalMaterial> materialesMasComprados) {
        this.materialesMasComprados = materialesMasComprados;
    }

    public List<TotalMaterial> getMaterialesMasVendidos() {
        return materialesMasVendidos;
    }

    public void setMaterialesMasVendidos(List<TotalMaterial> materialesMasVendidos) {
        this.materialesMasVendidos = materialesMasVendidos;
    }

    public Integer getTotalComprasAnio() {
        return totalComprasAnio;
    }

    public void setTotalComprasAnio(Integer totalComprasAnio) {
        this.totalComprasAnio = totalComprasAnio;
    }

    public Integer getTotalVentasAnio() {
        return totalVentasAnio;
    }

    public void setTotalVentasAnio(Integer totalVentasAnio) {
        this.totalVentasAnio = totalVentasAnio;
    }

    public BigDecimal getInversionRealizada() {
        return inversionRealizada;
    }

    public void setInversionRealizada(BigDecimal inversionRealizada) {
        this.inversionRealizada = inversionRealizada;
    }
}
