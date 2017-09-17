
package Include;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Usuario {
    
    private String username;
    private String password;
    private String fecharegistro;
    private String fechaingreso;

    /**
     * @return the username
     */
    
    
    
    public Usuario(String username, String password, String fecharegistro, String fechaingreso) {
        this.username = username;
        this.password = password;
        //this.fecharegistro = fecharegistro;
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd hh:mm:ss");
        this.fechaingreso = sdf.format(d);
                
        //this.fechaingreso = fechaingreso;
    }

    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the fecharegistro
     */
    public String getFecharegistro() {
        return fecharegistro;
    }

    /**
     * @param fecharegistro the fecharegistro to set
     */
    public void setFecharegistro(String fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    /**
     * @return the fechaingreso
     */
    public String getFechaingreso() {
        return fechaingreso;
    }

    /**
     * @param fechaingreso the fechaingreso to set
     */
    public void setFechaingreso(String fechaingreso) {
        this.fechaingreso = fechaingreso;
    }
    
    
}
