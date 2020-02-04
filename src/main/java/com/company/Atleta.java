package com.company;

public class Atleta extends Thread {
    Testimoni t;
    Testimoni t2;
    public Atleta(Testimoni t, Testimoni t2, String nom){
        super(nom);
        this.t = t;
        this.t2 =t2;
    }

    public void run(){

    }

}
