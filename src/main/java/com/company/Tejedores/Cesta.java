package com.company.Tejedores;

import javax.accessibility.AccessibleAction;

public class Cesta {
    private int capacidadMaximaCesta;
    public int count = 0;

    Cesta(int capacidadMaximaCesta) {
        this.capacidadMaximaCesta = capacidadMaximaCesta;
    }

    public synchronized void agregarPiezas(){
        try {
            while (count == capacidadMaximaCesta)wait();
            count++;
            notifyAll();

        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public synchronized void quitarPiezas(){
        try {

            while (count == 0)wait();
            count--;
            notifyAll();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
