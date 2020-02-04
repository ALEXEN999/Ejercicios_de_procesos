package com.company.Tejedores;

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

            System.out.println("Quedan -> " + cestaMangas.countMangas + "Mangas");
            cestaCuerpos.quitarPiezas();
            try {
                System.out.println("El ensamblador de "+getName()+" ha cogido "+getName());
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
