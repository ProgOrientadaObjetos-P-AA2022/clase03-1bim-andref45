/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //agregar valores a los atributos de h1 y h2 por teclado"

        String nombreHospital;
        int camasHospital;
        double presupuestoHospital;

        System.out.println("Ingrese el nombre del hospital: ");
        nombreHospital = entrada.nextLine();

        System.out.println("Ingrese el número de camas del hospital: ");
        camasHospital = entrada.nextInt();

        System.out.println("Ingrese el presupuesto del hospital: ");
        presupuestoHospital = entrada.nextDouble();

        Hospital h1 = new Hospital();
        h1.establecerNombre(nombreHospital);
        h1.establecerNumeroCamas(camasHospital);
        h1.establecerPresupuesto(presupuestoHospital);

        System.out.printf("%s - %d - %.2f\n", h1.obtenerNombre(),
                h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());

        entrada.nextLine();
        System.out.println("Ingrese el nombre del hospital:(2) ");
        nombreHospital = entrada.nextLine();

        System.out.println("Ingrese el número de camas del hospital:(2) ");
        camasHospital = entrada.nextInt();

        System.out.println("Ingrese el presupuesto del hospital:(2) ");
        presupuestoHospital = entrada.nextDouble();

        Hospital h2 = new Hospital();
        h2.establecerNombre(nombreHospital);
        h2.establecerNumeroCamas(camasHospital);
        h2.establecerPresupuesto(presupuestoHospital);

        System.out.printf("%s - %d - %.2f\n", h2.obtenerNombre(),
                h2.obtenerNumeroCamas(), h2.obtenerPresupuesto());

    }
}
