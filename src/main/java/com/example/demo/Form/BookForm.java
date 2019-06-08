package com.example.demo.Form;


import javax.persistence.Table;


public class BookForm {

    private String name;
    private String author;
    private String Genre;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return Genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }
}
