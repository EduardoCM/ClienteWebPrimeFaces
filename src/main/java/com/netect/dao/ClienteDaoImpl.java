package com.netect.dao;

import com.netect.model.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ClienteDaoImpl extends ConeccionDao  implements ClienteDao {

    @Override
    public void agregarCliente(Cliente cliente) {
        this.Conectar();
        
        try{
            String sql = "INSERT INTO CLIENTE (CODIGOCLIENTE, NOMBRE, APELLIDO,SEXO, PAIS, ESTADO, MUNICIPIO) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?) ";
            PreparedStatement st = this.getCon().prepareStatement(sql);
            
            st.setInt(1, cliente.getCodigoCliente());
            st.setString(2, cliente.getNombre());
            st.setString(3, cliente.getApellido());
            st.setString(4, cliente.getSexo());
            st.setString(5, cliente.getPais());
            st.setString(6, cliente.getEstado());
            st.setString(7, cliente.getMunicipio());
            
            st.executeUpdate();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }

    @Override
    public List<Cliente> listarClientes() {
      
       List<Cliente> lista = new ArrayList<Cliente>();
       
       
       this.Conectar();
        
        try{
           // String sql = "SELECT CODIGOCLIENTE, NOMBRE, APELLIDO,SEXO, PAIS, ESTADO, MUNICIPIO FROM CLIENTE";
            PreparedStatement st = this.getCon().prepareStatement(null);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                
            }
            
        }catch(Exception e){
            
        }
       return lista;
    }

    @Override
    public Cliente leerIdCliente(Cliente cliente) {
     return null;
    }

    @Override
    public void modificarCliente(Cliente cliente) {
    
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
    
    }
}
