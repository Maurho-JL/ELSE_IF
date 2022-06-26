/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package if_else;

import java.util.Scanner;

/**
 *
 * @author syste
 */
public class If_Else {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        String vocales;
        System.out.println("Ingrese Cualquier letra de los cinco vocales: ");
        vocales = sc.nextLine();
        String mostrar=null;
        if (vocales.equals("a") || vocales.equals("A")) {
            //System.out.println("Avion");
            mostrar="Avion";
        } 
        else if (vocales.equals("e") || vocales.equals("E")) {
            //System.out.println("Escuela");
            mostrar="Escuela";
        }
        else if (vocales.equals("i") || vocales.equals("I")){
            //System.out.println("Iglesia");
            mostrar="Iglesia";
        }
        else if (vocales.equals("o") || vocales.equals("O")){
            //System.out.println("Oso");
            mostrar="Oso";
        }
        else if (vocales.equals("u") || vocales.equals("U")){
            //System.out.println("Uva");
            mostrar="Uva";
        }
        
        else {System.out.println("La letra ingresada no es vocal.");}
        System.out.println(mostrar);
    }

}
