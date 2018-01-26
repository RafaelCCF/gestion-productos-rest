package com.restit.rest.gestion.productos.domain;

import java.util.List;


public class Prueba {
    Integer codigo;
    String descripcion;
    List<TotalMaterial> totalMaterialList;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public List<TotalMaterial> getTotalMaterialList() {
        return totalMaterialList;
    }

    public void setTotalMaterialList(List<TotalMaterial> totalMaterialList) {
        this.totalMaterialList = totalMaterialList;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
