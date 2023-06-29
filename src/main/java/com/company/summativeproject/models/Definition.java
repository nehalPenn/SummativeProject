package com.company.summativeproject.models;

public class Definition {
    int id;
    String word;
    String definition;

    public Definition(int id, String word, String definition) {
        this.id = id;
        this.word = word;
        this.definition = definition;
    }

    public Definition(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
