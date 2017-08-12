package com.netect.controller;

import com.netect.model.Cliente;
import com.netect.service.ClienteService;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class ClienteController {
    
    private Cliente cliente;
    private ClienteService clienteService;
    
    private List<String> lstEstados;
    private List<String> lstMunicipios;
    
    @PostConstruct
    public void init(){
        cliente = new Cliente();
    }
    
    public void guardarCliente(){
        clienteService.agregarCliente(cliente);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
    public void cargarEstados(){
        
        switch(cliente.getPais()){
            case "mexico":
                lstEstados = new ArrayList<>();
                lstEstados.add("Guadalajara");
                lstEstados.add("Mexico");
              break;
              
            case "eua":
                lstEstados = new ArrayList<>();
                lstEstados.add("California");
                lstEstados.add("New York");
                break;
        }
   
}
 
    
    public void cargarMunicipios(){
            
            switch(cliente.getEstado()){
            case "Guadalajara":
                lstMunicipios = new ArrayList<>();
                lstMunicipios.add("Zapopan");
                lstMunicipios.add("Tequila");
              break;
              
            case "Mexico":
                lstMunicipios = new ArrayList<>();
                lstMunicipios.add("Ecatepec");
                lstMunicipios.add("Toluca");
                break;
                
                case "California":
                lstMunicipios = new ArrayList<>();
                lstMunicipios.add("California estado 1");
                lstMunicipios.add("California estado 2");
                break;
                
                case "New York":
                lstMunicipios = new ArrayList<>();
                lstMunicipios.add("New York 1");
                lstMunicipios.add("New York 2");
                break;
        }
    }

    public List<String> getLstEstados() {
        return lstEstados;
    }

    public void setLstEstados(List<String> lstEstados) {
        this.lstEstados = lstEstados;
    }

    public List<String> getLstMunicipios() {
        return lstMunicipios;
    }

    public void setLstMunicipios(List<String> lstMunicipios) {
        this.lstMunicipios = lstMunicipios;
    }
    
    
    
}
