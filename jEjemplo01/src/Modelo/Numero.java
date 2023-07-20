/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LugoUAdeC
 */
public class Numero {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public Numero() {
        numero=0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return String.valueOf(numero);
    }
    
}
