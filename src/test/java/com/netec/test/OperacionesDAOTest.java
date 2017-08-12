/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.test;

import com.netect.dao.ClienteDao;
import com.netect.dao.ClienteDaoImpl;
import com.netect.model.Cliente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author edcastillo
 */
public class OperacionesDAOTest {
   
    @Test
    public void testInsert(){
        ClienteDao clienteDao = new ClienteDaoImpl();
        
        Cliente cliente = new Cliente();
        cliente.setCodigoCliente(1);
        cliente.setNombre("Eduardo");
        cliente.setApellido("Castillo");
        cliente.setSexo("Masculino");
        cliente.setPais("Mexico");
        cliente.setEstado("Guadalajara");
        cliente.setMunicipio("Zapopan");
        
        clienteDao.agregarCliente(cliente);
    }
}
