/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author YM
 */

import java.time.LocalDate;

/**
 * Registra un préstamo: fecha, usuario y libro asociado.
 */
public class Prestamo {

    private LocalDate fecha;
    private Usuario usuario;
    private Libro libro;

    /**
     * Crea un registro de préstamo.
     * @param fecha fecha del préstamo
     * @param usuario usuario que recibe el libro
     * @param libro libro prestado
     */
    public Prestamo(LocalDate fecha, Usuario usuario, Libro libro) {
        this.fecha = fecha;
        this.usuario = usuario;
        this.libro = libro;
    }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    public Libro getLibro() { return libro; }
    public void setLibro(Libro libro) { this.libro = libro; }

    @Override
    public String toString() {
        return "Préstamo [" + fecha + "] " + usuario.getNombre()
                + " -> " + libro.getTitulo();
    }
}