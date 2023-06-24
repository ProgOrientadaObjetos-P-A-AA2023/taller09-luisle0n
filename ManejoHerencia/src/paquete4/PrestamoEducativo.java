
package paquete4;

import paquete2.InstitucionEducativa;
import paquete2.Persona;
import paquete2.Prestamo;

public class PrestamoEducativo extends Prestamo{
    private String nivelEstudio;
    private InstitucionEducativa insEduca;
    private double valorCarrera;
    private double valorMensual;

    public PrestamoEducativo(String n, InstitucionEducativa i,
            double v, Persona b, int t, String c) {
        super(b, t, c);
        nivelEstudio = n;
        insEduca = i;
        valorCarrera = v;
    }

    public void establecerNivelEstudio(String n) {
        nivelEstudio = n;
    }

    public void establecerInsEduca(InstitucionEducativa i) {
        insEduca = i;
    }

    public void setValorCarrera(double v) {
        valorCarrera = v;
    }

    public void establecerValorMensual() {
        valorMensual = (valorCarrera/tiempoPrestamo)-(0.10*(valorCarrera/tiempoPrestamo));
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public InstitucionEducativa obtenerInsEduca() {
        return insEduca;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }
     @Override
    public String toString() {
       String Cadena = String.format("Prestamo Educativo");
       Cadena =String.format(" %s\n%s",Cadena, super.toString());       
       Cadena= String.format("%sNivel Estudio: %s\n"
               + "Institucion Educativa: %s\n"
               + "Valor Carrera: %.2f\n"
               + "Valor Mensual: %.2f\n",Cadena,obtenerNivelEstudio(),
               insEduca,
               obtenerValorCarrera(),
               obtenerValorMensual());
       return Cadena;
       
    }
   
    
}
