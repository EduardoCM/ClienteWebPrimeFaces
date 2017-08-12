package com.netect.service;

import com.netect.model.Cliente;
import java.util.List;


public interface ClienteService {
    
    public void agregarCliente(Cliente cliente);
    
    public List<Cliente> listarClientes();
    
    public Cliente leerIdCliente(Cliente cliente);
    
    public void modificarCliente(Cliente cliente);
    
    public void eliminarCliente(Cliente cliente);
    
}
