package com.restit.rest.gestion.productos.dao;


import com.restit.rest.gestion.productos.domain.TotalMaterial;

import java.math.BigDecimal;
import java.util.List;

public interface ConsultasMesasDAO {

    Integer consultarCantidadMesas();

    Integer consultarCantidadVentas();

    List<TotalMaterial> consultarMesasVendidas();

    List<TotalMaterial> consultarMesasCompradas();

    List<TotalMaterial> consultarMaterialMasComprado();

    List<TotalMaterial> consultarMaterialMasVendido();

    Integer consultarMesasCompradasPorAño(String fechaConsulta);

    Integer consultarMesasVendidasPorAño(String fechaConsulta);

    BigDecimal consultarGananciasVentas();

    BigDecimal consultarInversionRealizada();
}
