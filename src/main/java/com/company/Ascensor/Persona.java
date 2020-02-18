package com.company.Ascensor;

public class Persona extends Thread{
    int plantaActual;
    int plantaDestino;
    Ascensor ascensor;
    boolean estaDentro;
    String name;

    public Persona(String name, int plantaActual, int plantaDestino, Ascensor ascensor) {
        super(name);
        this.name = name;
        this.plantaActual = plantaActual;
        this.plantaDestino = plantaDestino;
        this.ascensor = ascensor;
    }

    @Override
    public void run() {
        super.run();

        for (;;){

            try {
                Thread.sleep((long) (Math.random() * 3000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
                ascensor.subirse(plantaActual);
            System.out.println(name+" se ha subido al ascensor");


            try {
                Thread.sleep((long) (Math.random() * 3000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ascensor.bajarse(plantaDestino);
            System.out.println(name+" se ha bajado del ascensor");


        }
    }
}
