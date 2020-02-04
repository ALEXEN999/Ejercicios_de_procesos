package com.company.Tejedores;

import static com.company.Tejedores.ColouredSystemOutPrintln.*;

public class Tejedor extends Thread {
    Cesta cesta;
    String pieza;

    public Tejedor(Cesta cesta, String pieza) {
        this.pieza = pieza;
        this.cesta = cesta;
    }

    @Override
    public void run() {
        super.run();
        for (;;){
            try {
                Thread.sleep((long)(Math.random() * 3000));

                    cesta.agregarPiezas();
                    System.out.println(ANSI_YELLOW+"El tejedor de "+pieza+" ha agregado a la cesta "+pieza+ANSI_RESET);
                    System.out.println();


            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
