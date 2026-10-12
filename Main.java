/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author YM
 */

/**
 * Clase principal para probar el sistema de biblioteca.
 */
public class Main {

    public static void main(String[] args) {
        Libro l1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-0307474728");
        Libro l2 = new Libro("El Quijote", "Miguel de Cervantes", "978-8420412146");
        Usuario u1 = new Usuario("Yomairy Mercedes", "U-001");
        Usuario u2 = new Usuario("Carlos Pérez", "U-002");

        System.out.println("--- Estado inicial ---");
        System.out.println(l1);
        System.out.println(l2);

        System.out.println("\n--- Préstamo ---");
        Prestamo p1 = u1.prestarLibro(l1);
        System.out.println(p1);

        System.out.println("\n--- Intento de prestar un libro ya prestado ---");
        Prestamo p2 = u2.prestarLibro(l1);
        System.out.println("Resultado: " + p2);

        System.out.println("\n--- Consultar disponibilidad ---");
        System.out.println(l1.getTitulo() + ": " + l1.consultarDisponibilidad());
        System.out.println(u1);

        System.out.println("\n--- Devolución ---");
        u1.devolverLibro(l1);
        System.out.println(l1);
        System.out.println(u1);
    }
}