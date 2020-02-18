package com.company.bañosMixtos;

public class Baño {
    boolean hayHombre = false;
    boolean hayMujer = false;
    int countH;
    int countM;
    boolean ocupado = false;

    public synchronized void entrar(String genero) throws InterruptedException {
            if (ocupado) {
                if (genero.equals("hombre") && hayMujer) wait();
                else if (genero.equals("mujer") && hayHombre) wait();
                else if (genero.equals("hombre") && hayHombre) {
                    hayHombre = true;
                    countH++;
                    notifyAll();
                } else if (genero.equals("mujer") && hayMujer) {
                    hayMujer = true;
                    countM++;
                    notifyAll();
                }
            }
        if (!ocupado) {
            ocupado = true;
            notifyAll();
        }
    }


    public synchronized void salir(String genero) throws InterruptedException {
        if (ocupado){
            if (genero.equals("hombre")){
                countH--;
                notifyAll();
                Thread.sleep((long)(Math.random() * 3000));
            }else if (genero.equals("mujer")){
                countM--;
                notifyAll();
                Thread.sleep((long)(Math.random() * 3000));
            }
            if (countM ==0 || countH ==0){
                ocupado =false;
                notifyAll();

            }
        }
    }
}
