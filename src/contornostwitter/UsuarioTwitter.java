/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contornostwitter;

import java.time.LocalDate;

/**
 * Objeto donde se guardan todos los datos de cada usuario.
 * 
 * En esta clase guardamos la informacion de el usuario, todo se podra 
 * modificar excepto el nombre y la fecha de nacimiento que una vez guardado 
 * no se modifican.
 * 
 * @author usuario
 * @version 1.0
 * @since 1.0
 * @see Tweet
 */
public class UsuarioTwitter {
    /**
     * El nic guarda el apodo del usuario.
     */
    private String nic;
    /**
     * Aqui se guarda el nombre del usuario
     */
    private String nombre;
     /**
     * Aqui se guarda el primer apellido del usuario
     */
    private String apellido1;
     /**
     * Aqui se guarda el segundo apellido del usuario
     */
    private String apellido2;
    /**
     * En esta variable guardamos el email del usuario
     */
    private String email;
    /**
     * En esta variable guardamos su fecha de nacimiento
     */
    private LocalDate fechaNaci;
    /**
     * En este consructor daremos un usuario de alta por defecto.
     * 
     * Este metodo pone por defecto un usuario para realizar pruebas.
     * 
     */
    public UsuarioTwitter() {
        this.nic = "@fake_bot";
        this.nombre = "Elon";
        this.apellido1 = "Musk";
        this.apellido2 = null;
        this.email = "fakebot@twitter.com";
        this.fechaNaci = LocalDate.now();
    }
    /**
     * Constructor para dar de alta un Usuario.
     * 
     * Este constructor pide todos los datos requeridos para dar de alta un
     * usuario con toda la informacion completa.
     * 
     * @param nic
     * @param nombre
     * @param apellido1
     * @param apellido2
     * @param email
     * @param fechaNaci 
     */
    public UsuarioTwitter(String nic, String nombre, String apellido1, String apellido2, String email, LocalDate fechaNaci) {
        this.nic = nic;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.fechaNaci = fechaNaci;
    }
    /**
     * Visualiza el apodo.
     * @return nic
     */
    public String getNic() {
        return nic;
        
    }
    /**
     * Guarda un apodo
     * @param nic 
     */
    public void setNic(String nic) {
        this.nic = nic;
    }
    /**
     * Visualiza el nombre.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Guarda el nombre del usuario
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Visualiza el primer apellido
     * @return 
     */
    public String getApellido1() {
        return apellido1;
    }
    /**
     * Guarda el primer apellido
     * @param apellido1 
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    /**
     * Visualiza el segundo apellido
     * @return 
     */
    public String getApellido2() {
        return apellido2;
    }
    /**
     * Guarda el segundo apellido
     * @param apellido2 
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    /**
     * Visualiza el email del usuario
     * @return 
     */
    public String getEmail() {
        return email;
    }
    /**
     * Guarda el email del usuario
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Visualiza la fecha de nacimiento
     * @return 
     */
    public LocalDate getFechaNaci() {
        return fechaNaci;
    }
    /**
     * Guarda la fecha de nacimiento
     * @param fechaNaci 
     */
    public void setFechaNaci(LocalDate fechaNaci) {
        this.fechaNaci = fechaNaci;
    }
    /**
     * Este metodo resta a la fecha de nacimiento la fecha actual para obtener
     * su edad.
     * @return edad
     */
    public int edad() {
        Date
        return
    }
    /**
     * Este metodo muestra toda la informacion del usuario.
     * Se devuelve un String con toda la informacion de el usuario.
     * @return 
     * @Override
     */
    public String toString() {
        return "UsuarioTwitter{" + "nic=" + nic + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", email=" + email + ", fechaNaci=" + fechaNaci + '}';
    }
    
}
