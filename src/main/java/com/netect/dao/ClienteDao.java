package com.netect.dao;

import com.netect.model.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public interface ClienteDao {
    
    public void agregarCliente(Cliente cliente);
    
    public List<Cliente> listarClientes();
    
    public Cliente leerIdCliente(Cliente cliente);
    
    public void modificarCliente(Cliente cliente);
    
    public void eliminarCliente(Cliente cliente);
    
}
