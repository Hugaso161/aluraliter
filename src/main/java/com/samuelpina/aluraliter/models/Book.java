package com.samuelpina.aluraliter.models;

import jakarta.persistence.*;

@Entity
@Table(name = "libros")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String titulo;
    @ManyToOne
    private Author autor;

    @Enumerated(EnumType.STRING)
    private Lingua lingua;
    private int totDownload;

    public Book() {
    }

    public Book(DatosBook book) {
        this.titulo = book.titulo();
        this.autor = new Author(book.autores().get(0));
        this.lingua = Lingua.fromString(book.lingua().get(0));
        this.totDownload = book.totDownload();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Author getAutor() {
        return autor;
    }

    public void setAutores(Author autor) {
        this.autor = autor;
    }

    public Lingua getLingua() {
        return lingua;
    }

    public void setLingua(Lingua lingua) {
        this.lingua = lingua;
    }

    public int getTotDownload() {
        return totDownload;
    }

    public void setTotDownload(int totDownload) {
        this.totDownload = totDownload;
    }

    @Override
    public String toString() {
        return "titulo: " + titulo + "\nautor: " + autor.getNombre() + "\nlingua: " + lingua + "\ntotDownload: "
                + totDownload;
    }

}
