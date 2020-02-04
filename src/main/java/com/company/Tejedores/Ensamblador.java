package com.company.Tejedores;


import static com.company.Tejedores.ColouredSystemOutPrintln.*;

public class Ensamblador extends Thread {

    Cesta cestaMangas;
    Cesta cestaCuerpos;

    public Ensamblador(Cesta cestaMangas, Cesta cestaCuerpos, String nombre) {
        super(nombre);
        this.cestaMangas = cestaMangas;
        this.cestaCuerpos = cestaCuerpos;
    }

    @Override
    public void run() {
        super.run();
        for (;;){
            cestaMangas.quitarPiezas();
            cestaMangas.quitarPiezas();
            cestaCuerpos.quitarPiezas();
            try {
                System.out.println(ANSI_RED+"El ensamblador de "+getName()+" ha cogido "+getName()+" de la cesta"+ANSI_RESET);
                System.out.println();
                Thread.sleep((long)(Math.random() * 3500));
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
