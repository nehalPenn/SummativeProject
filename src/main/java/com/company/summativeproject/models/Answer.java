package com.company.summativeproject.models;

public class Answer {

    int id;
    String answer;
    String question;


    public Answer(){ }

    public Answer(String answer, int id) {
        this.answer = answer;
        this.id = id;
    }

    public Answer(String question, String answer, int id) {
        this.question = question;
        this.answer = answer;
        this.id = id;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
