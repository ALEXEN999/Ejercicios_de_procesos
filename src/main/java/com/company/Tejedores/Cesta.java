package com.company.Tejedores;

import javax.accessibility.AccessibleAction;

public class Cesta {
    private boolean estaLleno = false;
    private int capacidadMaximaCesta;
    public int countMangas = 0;
    public int countCuerpo = 0;


    Cesta(int capacidadMaximaCesta) {
        this.capacidadMaximaCesta = capacidadMaximaCesta;
    }

    public synchronized void agregarPiezas(){
        try {

            while (estaLleno)wait();

            if (capacidadMaximaCesta == countMangas || capacidadMaximaCesta == countCuerpo){
                estaLleno = true;
            }
            if (!estaLleno){
                countMangas += 1;

                countCuerpo += 1;
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }

        notifyAll();
    }

    public synchronized void quitarPiezas(){
        try {

            while (countMangas <= 1 && countCuerpo == 0)wait();

            if (countMangas >=2){
                System.out.println("El enamblador ha cogido "+countMangas);
                countMangas -= 2;
            }
            if (countCuerpo >= 1){
                System.out.println("El enamblador ha cogido "+countMangas);
                countCuerpo -=1;
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        notifyAll();
    }
}
