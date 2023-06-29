package com.company.summativeproject.models;

public class Quote {
    String author;
    String quote;
    int id;

    public Quote(String author, String quote, int id) {
        this.author = author;
        this.quote = quote;
        this.id = id;
    }

    public Quote(){}

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
