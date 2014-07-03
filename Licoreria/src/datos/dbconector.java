package datos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Java
 */
public class dbconector {
    
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement pst;
    
    public dbconector(){ 
    try{ 
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/licoreria","root","");
        st = con.createStatement();
    }catch(Exception ex){
        System.out.println("error" +ex);
        }
    }
    
    public boolean getdata(String usuario, String clave){
        
        
        try {
            String query = "select * from validacion WHERE user = '"+usuario+"' && pass ='"+ clave+"'";
            rs = st.executeQuery(query);
          
            while(rs.next()){
  
                if(rs.getRow() == 1){
                return true;
                }       
            }
                
        }catch (Exception ex){
              System.out.println("error" + ex);
        }
        return false;
        
    }
    
    public boolean insertar(String usuario, String clave){
        
        try {
          
            pst =  con.prepareStatement("INSERT INTO validacion (Id,user,pass)Values (?,?,?)");
            pst.setString(1, null);
            pst.setString(2, usuario);
            pst.setString(3, clave);
            pst.executeUpdate();
        
            String query = "select user from validacion WHERE user = '"+usuario+"'";
            rs = st.executeQuery(query);
            while(rs.next()){
  
                if(rs.getRow() == 1){
                return true;
                }       
            }

        }catch (Exception ex){
              System.out.println("error" + ex);
        }
        return false;
    
    }
    
    public ResultSet buscar(String tabla){
        
       
        try {
            String query = "select * from "+tabla+"";
            rs = st.executeQuery(query);
            //return rs;
          
            
                
        }catch (Exception ex){
              System.out.println("error" + ex);
        }
        return rs;
        
        
    }
    
    

    }
    
    

