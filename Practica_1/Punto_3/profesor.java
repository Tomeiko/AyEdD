/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AYED;

/**
 *
 * @author Usuario
 */
public class profesor {
    
    private String nombre;
    private String apellido;
    private String email;
    private String catedra;
    private String facultad;
    
    public  profesor (String nombre, String apellido, String email, String catedra, String facultad) {
        setnombre (nombre);
        setapellido (apellido);
        setcatedra (catedra);
        setemail (email);   
        setfacultad (facultad);
    }
    
    public void setnombre (String nombre) {
        this.nombre = nombre;
    }
    
    public void setapellido (String apellido) {
        this.apellido = apellido;
    }
 
    public void setemail (String email) {
        this.email = email;
    }
    
    public void setcatedra (String catedra) {
        this.catedra = catedra;
    }
    
    public void setfacultad (String facultad) {
        this.facultad = facultad;
    }
    
    public String getnombre () {
        return nombre;
    }
    
    public String getapellido () {
        return apellido;
    }
    
    public String getemail () {
        return email;
    }
    
    public String getcatedras () {
        return catedra;
    }
    
    public String getfacultad () {
        return facultad;
    }
    
    public String tusDatos () {
        return "N: " + this.getnombre() + " A: " + this.getapellido() + " E: " + this.getemail() + " C: " + this.getcatedras() + " F: " + this.getfacultad();
    }
}
