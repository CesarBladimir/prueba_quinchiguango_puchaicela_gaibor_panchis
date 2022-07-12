/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Persona;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows 10
 */
public class Aplicacion {
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        Persona p1= new Persona ();
        System.out.println("ingrese el nombre 1");
        p1.setNombre1(leer.next());
        System.out.println("ingrese numero cedula");
        
        System.out.println("ingrese el nombre 2");
        p1.setNombre2(leer.next());
        System.out.println("ingrese el apellido 1");
        p1.setApellido1(leer.next());
        System.out.println("ingrese el apellido 2");
        p1.setApellido2(leer.next());
        
        JOptionPane.showMessageDialog(null, p1.toString());
        
        
    }
}
