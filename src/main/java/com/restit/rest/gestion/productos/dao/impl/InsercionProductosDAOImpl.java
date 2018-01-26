package com.restit.rest.gestion.productos.dao.impl;

import com.restit.rest.gestion.productos.dao.InsercionProductosDAO;
import com.restit.rest.gestion.productos.domain.Mesa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Repository
public class InsercionProductosDAOImpl implements InsercionProductosDAO {


    @Resource(name = "dataSourcePortProveedor")
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSourcePortProveedor() {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    //@Override
    public void insertarMesas(Mesa mesa) {

        String sql = "INSERT INTO mesas (modelo,marca,material,precio,patas,dimension,forma,descripcion) VALUES (?,?,?,?,?,?,?,?)";
        //String sql = "INSERT INTO mesas (modelo,marca,material,precio,patas,dimension,forma,descripcion) VALUES ('Mesa de comedor t41','Apple','Madera',13500.21,4,'4x3','Ovalada','Mesa comoda para trabajar o descansar, ideal para todo tipo de ocasiones')";
        jdbcTemplate.update(sql, mesa.getModelo(), mesa.getMarca(), mesa.getMaterial(), mesa.getPrecio(), mesa.getCantidadPatas(), mesa.getDimension(), mesa.getForma(), mesa.getDescripcion());

    }

}
