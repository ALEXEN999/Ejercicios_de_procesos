package com.company.bañosMixtos;

public class Persona extends Thread {
    String nombre;
    String genero;
    Baño baño;

    public Persona(String nombre, String genero, Baño baño) {
        super(nombre);
        this.nombre = nombre;
        this.genero = genero;
        this.baño = baño;
    }

    @Override
    public void run() {
        super.run();
        for (;;) {
            try {
                Thread.sleep((long) (Math.random() * 3000));
                baño.entrar(genero);
                System.out.println(nombre + " a entrado en el baño");
                
                Thread.sleep((long) (Math.random() * 5000));
                baño.salir(genero);
                System.out.println(nombre + " a salido en el baño");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
