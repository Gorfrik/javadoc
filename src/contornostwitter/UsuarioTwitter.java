package contornostwitter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

    private String nic;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;
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
     * @param nic Apodo del usuario.
     * @param nombre Nombre del usuario
     * @param apellido1 Primer apellido del usuario
     * @param apellido2 Segundo apellido del usuario
     * @param email Email del usuario
     * @param fechaNaci Fecha de nacimiento del usuario
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
     * Retorna String apodo.
     * @return nic
     */
    public String getNic() {
        return nic;
        
    }
    /**
     * Nuevo valor apodo
     * @param nic Nuevo valor String para el apodo
     */
    public void setNic(String nic) {
        this.nic = nic;
    }
    /**
     * Retorna el nombre.
     * @return devuelve el nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Nuevo valor nombre
     * @param nombre nuevo valor para el nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Retorna el primer apellido
     * @return devuelve el primer apellido
     */
    public String getApellido1() {
        return apellido1;
    }
    /**
     * Nuevo valor para primer apellido
     * @param apellido1 Nuevo valor para el primer apellido
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    /**
     * Retorna el segundo apellido
     * @return devuelve el valor del segundo apellido
     */
    public String getApellido2() {
        return apellido2;
    }
    /**
     * Nuevo valor para el segundo apellido
     * @param apellido2 Establece un nuevo valor para el segundo apellido.
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    /**
     * Retorna el email del usuario
     * @return devuelve el email del usuario
     */
    public String getEmail() {
        return email;
    }
    /**
     * Nuevo valor el email del usuario
     * @param email Establece un nuevo email para el usuario.
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Retorne la fecha de nacimiento
     * @return Devuelve la fecha de nacimiento del usuario.
     */
    public LocalDate getFechaNaci() {
        return fechaNaci;
    }
    /**
     * Nuevo valor para la fecha de nacimiento
     * @param fechaNaci Establece un nuevo valor para la fecha de nacimiento.
     */
    public void setFechaNaci(LocalDate fechaNaci) {
        this.fechaNaci = fechaNaci;
    }
    /**
     * Este metodo resta a la fecha de nacimiento la fecha actual para obtener
     * su edad.
     * @return edad Devuelve la resusltante de restar la fecha actual a su 
     * fecha de nacimiento.
     */
    public int edad() {
        int edad=0;
        int AnioNaci=this.fechaNaci.getYear();
        int MesNaci=this.fechaNaci.getMonthValue();
     
        LocalDate FechaHoy= LocalDate.now();
        int anio = FechaHoy.getYear();
        int Mes = FechaHoy.getMonthValue();
        
        edad=anio-AnioNaci;
        if(MesNaci<Mes){
        edad--;
        }
        
        return edad;
    }
    /**
     * Este metodo que devuelve informacion de usuario.
     * El metodo devuelve un String con toda la informacion de el usuario.
     * @return 
     * 
     */
    public String toString() {
        return "UsuarioTwitter{" + "nic=" + nic + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", email=" + email + ", fechaNaci=" + fechaNaci + '}';
    }
    
}
