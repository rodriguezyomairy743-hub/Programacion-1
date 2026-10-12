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
import java.util.ArrayList;
import java.util.List;

/**
 * Representa un usuario de la biblioteca.
 */
public class Usuario {

    private String nombre;
    private String id;
    private List<Libro> librosPrestados;

    /**
     * Crea un usuario con su lista de libros prestados vacía.
     * @param nombre nombre del usuario
     * @param id identificador único
     */
    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.librosPrestados = new ArrayList<>();
    }

    /**
     * Presta un libro al usuario si está disponible.
     * @param libro libro a prestar
     * @return el Prestamo registrado, o null si el libro no está disponible
     */
    public Prestamo prestarLibro(Libro libro) {
        if (!libro.consultarDisponibilidad()) {
            System.out.println("El libro \"" + libro.getTitulo() + "\" no está disponible.");
            return null;
        }
        libro.setDisponible(false);
        librosPrestados.add(libro);
        return new Prestamo(LocalDate.now(), this, libro);
    }

    /**
     * Devuelve un libro que el usuario tenía prestado.
     * @param libro libro a devolver
     * @return true si se devolvió correctamente
     */
    public boolean devolverLibro(Libro libro) {
        if (librosPrestados.remove(libro)) {
            libro.setDisponible(true);
            return true;
        }
        System.out.println(nombre + " no tiene prestado \"" + libro.getTitulo() + "\".");
        return false;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public List<Libro> getLibrosPrestados() { return librosPrestados; }

    @Override
    public String toString() {
        return nombre + " (ID: " + id + ") - Libros prestados: " + librosPrestados.size();
    }
}