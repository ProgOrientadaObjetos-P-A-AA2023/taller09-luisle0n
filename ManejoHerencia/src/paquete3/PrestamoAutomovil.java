/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Persona;
import paquete2.Prestamo;


/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo{
    
    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona garante;
    private double valorAutomovil;
    private double valorMesual;

    public PrestamoAutomovil(String ti,String m, Persona ga,
            double valorA,Persona b, int t, String c) {
        super(b, t, c);
        tipoAutomovil=ti;
        marcaAutomovil=m;
        garante=ga;
        valorAutomovil=valorA;   
    }

    public void establecerTipoAutomovil(String ti) {
        tipoAutomovil = ti;
    }

    public void establecerMarcaAutomovil(String m) {
        marcaAutomovil = m;
    }

    public void estabelecerGarante(Persona g) {
        garante = g;
    }

    public void establecerValorAutomovil(double valorA) {
        valorAutomovil = valorA;
    }

    public void calcularValorMesual() {
        valorMesual = valorAutomovil/tiempoPrestamo;
    }

    public String obtenerTipoAutomovil() {
        return tipoAutomovil;
    }

    public String obtenerMarcaAutomovil() {
        return marcaAutomovil;
    }

    public Persona obtenerGarante() {
        return garante;
    }

    public double obtenerValorAutomovil() {
        return valorAutomovil;
    }

    public double obtenerValorMesual() {
        return valorMesual;
    }

    @Override
    public String toString() {
       String Cadena = String.format("Prestamo Automovil");
       Cadena =String.format(" %s\n%s",Cadena, super.toString());
       Cadena= String.format("%sTipo Automovil: %s\n"
               + "Marca Automovil: %s\n"
               + "Garante: %s\n"
               + "Valor Automovil: %.2f\n"
               + "Valor Mensual: %.2f\n",Cadena,obtenerTipoAutomovil(),
               obtenerMarcaAutomovil(),
               garante,
               obtenerValorAutomovil(),
               obtenerValorMesual());
               
       return Cadena;
       
    }
    
    
    
}
