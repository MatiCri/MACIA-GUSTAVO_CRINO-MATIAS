package com.backend.dao.impl;

import com.backend.dao.IDao;
import com.backend.entity.Odontologo;
import org.apache.log4j.Logger;

import java.util.List;

public class OdontologoDaoEnMemoria implements IDao<Odontologo> {

    private static final Logger LOGGER = Logger.getLogger(OdontologoDaoEnMemoria.class);

    private List<Odontologo> odontologoRepositorio;

    public OdontologoDaoEnMemoria(List<Odontologo> odontologoRepositorio) {
        this.odontologoRepositorio = odontologoRepositorio;
    }

    @Override
    public Odontologo guardar(Odontologo odontologo) {
        odontologoRepositorio.add(odontologo);

        LOGGER.info("Se ha registrado el odontologo en memoria: " + odontologo);

        return odontologo;
    }

    @Override
    public List<Odontologo> listarTodos() {

        LOGGER.info("Listado de todos los odontologos: " + odontologoRepositorio);

        for (Odontologo o : odontologoRepositorio){
            LOGGER.info(o.getId() + ". " + o.getNombre());
        }

        return odontologoRepositorio;
    }
}
