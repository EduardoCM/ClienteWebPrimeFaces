package com.netect.service;

import com.netect.dao.ClienteDao;
import com.netect.dao.ClienteDaoImpl;
import com.netect.model.Cliente;
import java.util.List;

public class ClienteServiceImpl implements ClienteService{
    
    ClienteDao clienteDao;

    @Override
    public void agregarCliente(Cliente cliente) {
        clienteDao = new ClienteDaoImpl();
        clienteDao.agregarCliente(cliente);
    }

    @Override
    public List<Cliente> listarClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente leerIdCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
