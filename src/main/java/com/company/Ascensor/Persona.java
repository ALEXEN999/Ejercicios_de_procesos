package com.company.Ascensor;

import static com.company.Tejedores.ColouredSystemOutPrintln.*;

public class Persona extends Thread{
    int plantaActualPersona;
    int plantaDestinoPersona;
    Ascensor ascensor;
    String name;

    public Persona(String name, int plantaActualPersona, int plantaDestinoPersona, Ascensor ascensor) {
        super(name);
        this.name = name;
        this.plantaActualPersona = plantaActualPersona;
        this.plantaDestinoPersona = plantaDestinoPersona;
        this.ascensor = ascensor;
    }

    @Override
    public void run() {
        super.run();

        while (plantaActualPersona != plantaDestinoPersona){
            try {
                Thread.sleep((long) (Math.random() * 3000));
                ascensor.subirse(plantaActualPersona);
                System.out.println(ANSI_GREEN+name+ANSI_RESET+" se ha subido al ascensor en la planta "+ANSI_YELLOW+ascensor.plantaActualAscensor+ANSI_RESET+"\n");


            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                Thread.sleep((long) (Math.random() * 3000));
                ascensor.bajarse(plantaDestinoPersona);
                System.out.println(ANSI_RED+name+ANSI_RESET+" se ha bajado del ascensor de la planta "+ANSI_BLUE+ascensor.plantaActualAscensor+ANSI_RESET+"\n");

                plantaActualPersona = plantaDestinoPersona;

            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
