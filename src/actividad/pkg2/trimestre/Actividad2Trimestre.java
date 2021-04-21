/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg2.trimestre;

import java.util.Scanner;

/**
 *
 * @author salva
 */
public class Actividad2Trimestre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     String text = null;
    String text2 = null; 
    
    Scanner sc = new Scanner(System.in);
        System.out.println("(1) Enero" + "\n(2) Febrero" + "\n(3) Marzo" + "\n(4) Abril" + "\n(5) Mayo" + "\n(6) Junio" + "\n(7) Julio" + "\n(8) Agosto" + "\n(9) Septiembre" + "\n(10) Octubre" + "\n(11) Noviembre" + "\n(12) Diciembre");
    int dia = sc.nextInt();
                     
if (dia >= 1 && dia <=7) {
            switch (dia) {
                case 1:
                    System.out.println("Enero es primer trimestre.");
                    break;
                case 2:
                    System.out.println("Febrero es primer trimestre.");
                    break;
                case 3:
                    System.out.println("Marzo es primer trimestre.");
                    break;
                case 4:
                    System.out.println("Abril es segundo trimestre.");
                    break;
                case 5:
                    System.out.println("Mayo es segundo trimestre.");
                    break;
                case 6:
                    System.out.println("Junio es segundo trimestre.");
                    break;
                case 7:
                    System.out.println("Julio es tercer trimestre.");
                    break;
                case 8:
                    System.out.println("Agosto es tercer trimestre.");
                    break;
                case 9:
                    System.out.println("Septiembre es tercer trimestre.");
                    break;
                case 10:
                    System.out.println("Octubre es cuarto trimestre.");
                    break;
                case 11:
                    System.out.println("Noviembre es cuarto trimestre.");
                    break;
                case 12:
                    System.out.println("Diciembre es cuarto trimestre.");
                    break;
            }   
            
        } else {
            System.out.println("Que dia desea selleccionar?.");
        } 
    }
}