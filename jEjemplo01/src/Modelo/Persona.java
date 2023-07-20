/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Dr. Jose Edgar Lugo Castro
 */
public class Persona {
    private String Nombre;
    private String email;
    private int edad;

    public Persona(String Nombre, String email, int edad) {
        this.Nombre = Nombre;
        this.email = email;
        this.edad = edad;
    }

    public Persona() {
        Nombre="";
        email="";
        edad=0;
    
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", email=" + email + ", edad=" + edad + '}';
    }
    
}
