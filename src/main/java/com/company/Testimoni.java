package com.company;

import javax.management.monitor.Monitor;

public class Testimoni{
    boolean lliure;

    public Testimoni(){
        lliure = true;
    }

    public synchronized void Agafa() {
        try {
            while(!lliure) wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lliure = false;
        notifyAll();
    }

    public synchronized void Deixa() {
        lliure = true;
        notifyAll();
    }

}
