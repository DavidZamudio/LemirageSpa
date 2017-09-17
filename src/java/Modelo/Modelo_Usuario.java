/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Include.Encriptar;
import Include.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Modelo_Usuario extends Conexion{
    
    public boolean  CrearUsuario(Usuario u){    
        boolean flag = false;        
        PreparedStatement pst = null;
        try { 
            String sql = "call NuevoUsuario(?,?,?,?)";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, u.getUsername());
            pst.setString(2, Encriptar.sha1(u.getPassword()));
            pst.setString(3, u.getFecharegistro());
            pst.setString(4, u.getFechaingreso());
            
            if(pst.executeUpdate() == 1){
                    flag = true;
            }                
                    
        } catch (Exception e) {
            System.err.println(e.getMessage());
            }finally{
                try {
                    if(getConnection() != null) getConnection().close();
                    if(pst != null) pst.close();
                
                } catch (Exception e)  {
                
                
                }
        }
        return flag;
    }
    
    
    public boolean autenticar(Usuario u) {
        boolean flag = false;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
            try {
                String sql = "call autenticar(?,?)";
                pst = getConnection().prepareStatement(sql);
                pst.setString(1, u.getUsername());
                pst.setString(2, Encriptar.sha1(u.getPassword()));
                rs = pst.executeQuery();
                if(rs.absolute(1)){
                    flag = true;
                }
        } catch (Exception e) {
                System.err.println(e.getMessage());
        }finally{
                try {
                    if(getConnection() != null)getConnection().close();
                    if(pst != null) pst.close();
                    if(rs != null) rs.close();
                } catch (Exception e) {
                }
            }
        
        return flag;
    
    }
}
