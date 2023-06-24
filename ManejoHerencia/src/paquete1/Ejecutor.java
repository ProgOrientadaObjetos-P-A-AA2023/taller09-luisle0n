/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import paquete2.InstitucionEducativa;
import paquete2.Persona;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String continuar = null;
        String nomBeneficiario;
        String apeBeneficiario;
        String usuario;

        String nomGarante;
        String apeGarante;
        String usuarioGarante;
        int tiempoPrestamo;
        String ciudadPrestamo;
        String nombreInstitucion;
        String siglasInstitucion;
        String tipoAuto;
        String marcaAuto;
        double valorAuto;
        String nivelEstudio;
        double valorCarrera;

        boolean bandera = true, ban = true;
        int opcionPrestamo;
        int opcionBandera;
        List<Prestamo> lista = new ArrayList<>();

        do {
            System.out.print("Ingrese el nombre del beneficiario: ");
            nomBeneficiario = entrada.nextLine();
            System.out.print("Ingrese el apellido del beneficiario: ");
            apeBeneficiario = entrada.nextLine();
            System.out.print("Ingrese el usuario del beneficiario: ");
            usuario = entrada.nextLine();
            System.out.print("Ingrese los meses del prestamo: ");
            tiempoPrestamo = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Ingrese la ciudad donde se realizara el"
                    + " prestamo: ");
            ciudadPrestamo = entrada.nextLine();
            do {
                System.out.print("Sistema de prestamos\n"
                        + "Ingrese 1 para registrar un prestamo de automovil \n"
                        + "Ingrese 2 para registrar un prestamo educativo \n");
                opcionPrestamo = entrada.nextInt();

                entrada.nextLine();

                switch (opcionPrestamo) {

                    case 1:
                        ban = false;
                        System.out.print("Ingrese el tipo del vehiculo: ");
                        tipoAuto = entrada.nextLine();
                        System.out.print("Ingrese la marca  del vehiculo: ");
                        marcaAuto = entrada.nextLine();
                        System.out.print("Ingrese el valor  del vehiculo: ");
                        valorAuto = entrada.nextDouble();
                        entrada.nextLine();
                        System.out.print("Ingrese el nombre del garante: ");
                        nomGarante = entrada.nextLine();
                        System.out.print("Ingrese el apellido del garante: ");
                        apeGarante = entrada.nextLine();
                        System.out.print("Ingrese el usuario del garante: ");
                        usuarioGarante = entrada.nextLine();

                        Persona perB = new Persona(nomBeneficiario,
                                apeBeneficiario, usuario);

                        Persona datosGarante = new Persona(nomGarante,
                                apeGarante, usuarioGarante);

                        PrestamoAutomovil prestamoAutomovil = new PrestamoAutomovil(tipoAuto,
                                marcaAuto, datosGarante, valorAuto, perB,
                                tiempoPrestamo, ciudadPrestamo);
                        prestamoAutomovil.calcularValorMesual();

                        lista.add(prestamoAutomovil);
                        
                        break;
                    case 2:
                        ban = false;
                        System.out.print("Ingrese el nombre del centro educativo: ");
                        nombreInstitucion = entrada.nextLine();
                        System.out.print("Ingrese las siglas del centro educativo: ");
                        siglasInstitucion = entrada.nextLine();
                        System.out.print("Ingrese el nivel de estudio: ");
                        nivelEstudio = entrada.nextLine();
                        System.out.print("Ingrese el valor de la carrera: ");
                        valorCarrera = entrada.nextDouble();

                        Persona perB2 = new Persona(nomBeneficiario, apeBeneficiario,
                                usuario);

                        InstitucionEducativa centroEducativo
                                = new InstitucionEducativa(nombreInstitucion,
                                        siglasInstitucion);
                        PrestamoEducativo prestamoEducativo = new PrestamoEducativo(
                                nivelEstudio, centroEducativo,
                                valorCarrera, perB2,
                                tiempoPrestamo, ciudadPrestamo);
                        prestamoEducativo.establecerValorMensual();

                        lista.add(prestamoEducativo);
                        entrada.nextLine();
                        break;
                    default:
                        ban = true;
                        System.out.println("\nError, "
                                + "la opcion seleccionada no existe..\n");
                        break;
                }
            } while (ban);

            System.out.println("Desea ingresar más estudiante. Digite la "
                    + "letra S para continuar o digite la letra N para salir "
                    + "del proceso");
            continuar = entrada.nextLine();

        }while (continuar.equals("S"));
        
        System.out.println("");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

}
