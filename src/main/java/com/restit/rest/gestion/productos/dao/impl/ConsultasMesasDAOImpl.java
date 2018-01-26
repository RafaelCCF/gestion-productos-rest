package com.restit.rest.gestion.productos.dao.impl;

import com.restit.rest.gestion.productos.dao.ConsultasMesasDAO;
import com.restit.rest.gestion.productos.domain.TotalMaterial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.*;

import org.springframework.stereotype.Repository;


import javax.annotation.Resource;
import javax.sql.DataSource;
import java.math.BigDecimal;
import java.sql.*;

import java.util.List;


@Repository
public class ConsultasMesasDAOImpl implements ConsultasMesasDAO {

     @Resource(name = "dataSourcePortProveedor")
     private DataSource dataSource;
     private JdbcTemplate jdbcTemplate;

     @Autowired
     public void setDataSourcePortProveedor() {
         this.jdbcTemplate = new JdbcTemplate(dataSource);
     }

    @Override
     public Integer consultarCantidadMesas() {

        String sql = "select count(*) from mesas";
        return jdbcTemplate.queryForObject(sql, Integer.class);

    }

    @Override
     public Integer consultarCantidadVentas() {

        String sql = "select count(*) from ventas";
        return jdbcTemplate.queryForObject(sql, Integer.class);

    }




    @Override
    public List<TotalMaterial> consultarMesasVendidas() { //todo: cambiar a objeto

        String sql = "select count(*) as total, mesas.modelo, mesas.material from ventas INNER join mesas on mesas.id = ventas.mesas_id group by mesas.id order by total DESC";
        return jdbcTemplate.query(sql, new RowMapper<TotalMaterial>() {
            @Override
            public TotalMaterial mapRow(ResultSet resultSet, int i) throws SQLException {
                return mapperMesasCompradasVendidas(resultSet);
            }
        });
    }

    @Override
    public List<TotalMaterial> consultarMesasCompradas() {

        String sql = "select count(*) as total, mesas.modelo, mesas.material from compras INNER join mesas on mesas.id = compras.mesas_id group by mesas.id order by total DESC";
        return jdbcTemplate.query(sql, new RowMapper<TotalMaterial>() {
            @Override
            public TotalMaterial mapRow(ResultSet resultSet, int i) throws SQLException {
                return mapperMesasCompradasVendidas(resultSet);
            }
        });

    }


    @Override
    public List<TotalMaterial> consultarMaterialMasComprado() {

        String sql = "select count(*) as total, mesas.material from compras INNER join mesas on mesas.id = compras.mesas_id group by mesas.material ORDER BY total DESC";

        return jdbcTemplate.query(sql, new RowMapper<TotalMaterial>() {
            @Override
            public TotalMaterial mapRow(ResultSet resultSet, int i) throws SQLException {
                return mapperMaterialesMasCompradosVendidos(resultSet);
            }
        });

    }

    @Override
    public List<TotalMaterial> consultarMaterialMasVendido() { //todo: cambiar a objeto

        String sql = "select count(*) as total, mesas.material from ventas INNER join mesas on mesas.id = ventas.mesas_id group by mesas.material ORDER BY total DESC";
        return jdbcTemplate.query(sql, new RowMapper<TotalMaterial>() {
            @Override
            public TotalMaterial mapRow(ResultSet resultSet, int i) throws SQLException {
                return mapperMaterialesMasCompradosVendidos(resultSet);
            }
        });
    }

    @Override
    public Integer consultarMesasCompradasPorAño(String fechaConsulta) {

        String sql = "select count(*) as total from compras INNER join mesas on mesas.id = compras.mesas_id where compras.fecha_compra > " + fechaConsulta;
        return jdbcTemplate.queryForObject(sql, Integer.class);

    }

    @Override
    public Integer consultarMesasVendidasPorAño(String fechaConsulta) {

        String sql = "select count(*) as total from ventas INNER join mesas on mesas.id = ventas.mesas_id where ventas.fecha_venta > " + fechaConsulta;
        return jdbcTemplate.queryForObject(sql, Integer.class);

    }

    @Override
    public BigDecimal consultarGananciasVentas() {

        String sql = "select sum(mesas.precio) as total from ventas INNER join mesas on mesas.id = ventas.mesas_id;";
        return jdbcTemplate.queryForObject(sql, BigDecimal.class);

    }

    @Override
    public BigDecimal consultarInversionRealizada() {

        String sql = "select sum(compras.precio_compra) as total from compras INNER join mesas on mesas.id = compras.mesas_id";
        return jdbcTemplate.queryForObject(sql, BigDecimal.class);

    }



    private TotalMaterial mapperMaterialesMasCompradosVendidos(ResultSet resultSet) throws SQLException {
        TotalMaterial material = new TotalMaterial();
        material.setCantidad(resultSet.getInt("total"));
        material.setMaterial(resultSet.getString("material"));

        return material;
    }

    private TotalMaterial mapperMesasCompradasVendidas(ResultSet resultSet) throws SQLException {
        TotalMaterial material = new TotalMaterial();
        material.setCantidad(resultSet.getInt("total"));
        material.setMaterial(resultSet.getString("material"));
        material.setModelo(resultSet.getString("modelo"));

        return material;
    }



}