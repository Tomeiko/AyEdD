/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

/**
 *
 * @author Usuario
 */
public class estudiante {
    
    private String nombre;
    private String apellido;
    private int comision;
    private String email;
    private String direccion;
    
    
    public  estudiante (String nombre, String apellido, int comision, String email, String direccion) {
        setnombre (nombre);
        setapellido (apellido);
        setcomision (comision);
        setemail (email);
        setdireccion (direccion);
    }
    
    public void setnombre (String nombre) {
        this.nombre = nombre;
    }
    
    public void setapellido (String apellido) {
        this.apellido = apellido;
    }
    
    public void setcomision (int comision) {
        this.comision = comision;
    }
    
    public void setemail (String email) {
        this.email = email;
    }
    
    public void setdireccion (String direccion) {
        this.direccion = direccion;
    }
    
    public String getnombre () {
        return nombre;
    }
    
    public String getapellido () {
        return apellido;
    }
    
    public int getcomision () {
        return comision;
    }
    
    public String getemail () {
        return email;
    }
    
    public String getdireccion () {
        return direccion;
    }
    
    public String tusDatos () {
        return "N: " + this.getnombre() + " A: " + this.getapellido() + " C: " + this.getcomision() + " E: " + this.getemail() + " D: " + this.getdireccion();
    }
}
