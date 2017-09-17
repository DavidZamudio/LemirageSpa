
package Controlador;

import Include.Usuario;
import Modelo.Modelo_Usuario;


public class ControladorUsuario {
    
    public boolean crear(Usuario u){
            Modelo_Usuario mu = new Modelo_Usuario();
            return mu.CrearUsuario(u);    
    }
    
    public  boolean validar(Usuario u){
        Modelo_Usuario mu = new Modelo_Usuario();
        return mu.autenticar(u);
    
    }
}
