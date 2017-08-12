package com.netec.test;

import com.netect.dao.ConeccionDao;
import org.junit.Assert;
import org.junit.Test;

public class ConexionTest {
    
     @Test
     public void testConexion() {
         ConeccionDao con = new ConeccionDao();
         con.Conectar();       
         Assert.assertNotNull(con.getCon());
     }
    
}
