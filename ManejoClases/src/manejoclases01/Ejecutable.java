/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases01;


public class Ejecutable {
    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();
        Hospital h2 = new Hospital();
        // Se asigna valores particulares al objeto
        hospital.nombre = "San Pedro";
        hospital.numeroCamas = 480;
        hospital.presupuesto = 3242348.29;
        
        // Se presenta valores en pantalla
        System.out.printf("%s - %d - %.2f\n", hospital.nombre,
                hospital.numeroCamas, hospital.presupuesto);
        
        // Se asigna valores particulares al objeto
        h2.nombre = "San Lucas";
        h2.numeroCamas = 300;
        h2.presupuesto = 234.32;
        
        // Se presenta valores en pantalla
        System.out.printf("%s - %d - %.2f\n", h2.nombre,
                h2.numeroCamas, h2.presupuesto);
        
        // System.out.println(hospital.nombre + "-" + hospital.numeroCamas);
    }
}
