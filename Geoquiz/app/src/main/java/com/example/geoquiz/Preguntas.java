package com.example.geoquiz;

public class Preguntas {
    private int id;
    private boolean respuestas;



    public Preguntas(int id, boolean respuestas) {
        this.id = id;
        this.respuestas = respuestas;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isRespuestas() {
        return respuestas;
    }

    public void setRespuestas(boolean respuestas) {
        this.respuestas = respuestas;
    }
}
