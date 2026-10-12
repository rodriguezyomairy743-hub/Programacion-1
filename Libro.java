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
 * Representa un libro de la biblioteca.
 */
public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    /**
     * Crea un libro nuevo, disponible por defecto.
     * @param titulo título del libro
     * @param autor autor del libro
     * @param isbn código ISBN
     */
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }

    /**
     * Consulta si el libro está disponible para préstamo.
     * @return true si está disponible
     */
    public boolean consultarDisponibilidad() {
        return disponible;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    @Override
    public String toString() {
        return titulo + " (" + autor + ") - ISBN: " + isbn
                + " - " + (disponible ? "Disponible" : "Prestado");
    }
}