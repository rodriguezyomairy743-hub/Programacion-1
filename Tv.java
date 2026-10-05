/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author YM
 */
public class Tv {
    //Atributos
    String marca;
    int pulgadas;
    boolean encendido;
    int volumen;
    
    //Metodos
    public void encender() {
        System.out.println("La TV se esta encendiendo...");
        encendido = true;
    }
    public void apagar() {
        System.out.println("La TV se esta apagando...");
        encendido = false;
    }
    public void subirVolumen() {
        System.out.println("Subiendo el volumen...");
        volumen++;
    }
    public void bajarVolumen() {
        System.out.println("Bajando el volumen...");
        volumen--;
    }
}
