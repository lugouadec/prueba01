/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jejemplo01;

import Modelo.Numero;
import Modelo.Persona;

/**
 *
 * @author LugoUAdeC
 */
public class JEjemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Holas Mundo !!!");
        System.out.println("Esto es un cambio realizado al programa !!!");
                
        Numero n = new Numero();
        n.setNumero(10);
        System.out.println(n.toString());
        
        Persona p = new Persona();
        p.setEdad(18);
        p.setNombre("Jose Edgar Lugo ");
        p.setEmail("lugouadec@gmail.com");
        
        System.out.println("----- Salida por pantalla --------------");
        
        System.out.println(p );
        
        System.out.println("Dr. Jose Edgar Lugo Castro");
        
    }
    
}
