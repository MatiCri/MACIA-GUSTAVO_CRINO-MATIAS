package com.backend.service;

import com.backend.dao.impl.OdontologoDaoH2;
import com.backend.entity.Odontologo;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTest {

    private static Connection connection = null;

    private OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());

    @Test
    public void listarTodosLosPacientes(){
        List<Odontologo> odontologoList = odontologoService.listarOdontologos();
        assertFalse(odontologoList.isEmpty());
        assertTrue(odontologoList.size() == 2);

    }


}