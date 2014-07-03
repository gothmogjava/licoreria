/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import datos.dbconector;
import java.sql.ResultSet;

/**
 *
 * @author Java
 */
public class dominio {
    
        public ResultSet buscarproductos(){
            ResultSet rsBuscar;
            String tabla = "producto";
            dbconector connect = new dbconector();
            rsBuscar = connect.buscar(tabla);
            return rsBuscar;
           
        }
    
}
