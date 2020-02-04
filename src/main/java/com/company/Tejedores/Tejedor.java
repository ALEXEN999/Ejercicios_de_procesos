package com.company.Tejedores;

public class Tejedor extends Thread {
    Cesta cesta;
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public Tejedor(Cesta cesta, String pieza) {
        super(pieza);
        this.cesta = cesta;
    }

    @Override
    public void run() {
        super.run();
        for (;;){
            try {
                Thread.sleep(3000);

                cesta.agregarPiezas();
                System.out.println(ANSI_RED+"El tejedor de "+getName()+" ha agregado "+getName()+ANSI_RESET);
                System.out.println();
                System.out.println(ANSI_GREEN+"Ahora hay "+ cesta.countMangas+ " Mangas"+ANSI_RESET);
                System.out.println("Ahora hay "+ cesta.countCuerpo+" Cuerpos");
                System.out.println();
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
