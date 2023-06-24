/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author luisa
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String usename;
    
    public Persona(String n, String ap, String us) {
        nombre = n;
        apellido = ap;
        usename = us;
    }

    public void establcerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public void establecerCedula(String c) {
        usename = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerCedula() {
        return usename;
    }

    @Override
    public String toString() {
       String Cadena  = String.format("Persona\n"
               + "Nombre: %s\n"
               + "Apellido: %s\n"
               + "UserName: %s",obtenerNombre()
               ,obtenerApellido(),obtenerCedula());
       return Cadena;
       
    }
    
    
}
