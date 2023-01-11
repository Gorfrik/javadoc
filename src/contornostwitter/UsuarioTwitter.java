/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contornostwitter;

import java.time.LocalDate;

/**
 *
 * @author usuario
 */
public class UsuarioTwitter {

    private String nic;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;
    private LocalDate fechaNaci;

    public UsuarioTwitter() {
        this.nic = "@fake_bot";
        this.nombre = "Elon";
        this.apellido1 = "Musk";
        this.apellido2 = null;
        this.email = "fakebot@twitter.com";
        this.fechaNaci = LocalDate.now();
    }
    
    public UsuarioTwitter(String nic, String nombre, String apellido1, String apellido2, String email, LocalDate fechaNaci) {
        this.nic = nic;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.fechaNaci = fechaNaci;
    }

    public String getNic() {
        return nic;
        
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNaci() {
        return fechaNaci;
    }

    public void setFechaNaci(LocalDate fechaNaci) {
        this.fechaNaci = fechaNaci;
    }

    public int edad() {

        return
    }

    @Override
    public String toString() {
        return "UsuarioTwitter{" + "nic=" + nic + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", email=" + email + ", fechaNaci=" + fechaNaci + '}';
    }
    
}
