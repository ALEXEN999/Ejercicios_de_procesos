package com.company.FIlosofo;

public class Tenedor {
    boolean libre;
    String nom;

    public Tenedor(String nom) {
        libre = true;
        this.nom = nom;
    }


    public synchronized String getNom(){
        return nom;
    }

    public synchronized void agafar(){
        try {
            while (!libre)wait();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        libre=false;
        notifyAll();
    }

    public synchronized void deixar(){
            libre=true;

            notifyAll();
    }
}
