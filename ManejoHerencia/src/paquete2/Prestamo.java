/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Prestamo {
    
    protected Persona beneficiaario;
    protected int tiempoPrestamo;
    protected String ciudadPrestano;

    public Prestamo(Persona b, int t, String c) {
        beneficiaario = b;
        tiempoPrestamo = t;
        ciudadPrestano = c;
    }
    
    
    public void establecerBeneficiaario(Persona b) {
        beneficiaario = b;
    }
    public void establecerCiudadPrestano(String c) {
        ciudadPrestano = c.toLowerCase();
    }

    public Persona obtenerBeneficiaario() {
        return beneficiaario;
    }

    public int obtenerTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public String obtenerCiudadPrestano() {
        return ciudadPrestano;
    }
    @Override
    public String toString() {
       String Cadena  = String.format("Beneficiario: \n %s\n",beneficiaario);
       String cadena = String.format("Numero de meses: %d\n"
               + "Cuidad de Prestamo: %s\n",obtenerTiempoPrestamo()
               ,obtenerCiudadPrestano());
       return Cadena;
    }
    
    
    
    
}
