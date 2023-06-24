/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

public class InstitucionEducativa{

    private String nombre;
    private String siglas;

    public InstitucionEducativa(String nom, String sig) {
        nombre = nom;
        siglas = sig;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerSiglas(String s) {
        siglas = s;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerSiglas() {
        return siglas;
    }
    @Override
    public String toString() {
       String Cadena  = String.format("Instituciones Educativas\n"
               + "Nombre: %s\n"
               + "Siglas: %s",obtenerNombre()
               ,obtenerSiglas());
       return Cadena;
    }
}
