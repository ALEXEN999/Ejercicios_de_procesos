package com.company.bañosMixtos;

public class Restaurante {
    public static void main(String[] args) {
        Baño baño = new Baño();

        Persona hombre1 = new Persona("Juan","hombre", baño);
        Persona hombre2 = new Persona("Alejandro","hombre", baño);
        Persona hombre3 = new Persona("Marcos","hombre", baño);
        Persona hombre4 = new Persona("Pol","hombre", baño);
        Persona hombre5 = new Persona("Sam","hombre", baño);

        Persona mujer1 = new Persona("Sandra","mujer", baño);
        Persona mujer2 = new Persona("Alexa","mujer", baño);
        Persona mujer3 = new Persona("Cortana","mujer", baño);
        Persona mujer4 = new Persona("Maria","mujer", baño);
        Persona mujer5 = new Persona("Lucia","mujer", baño);


        hombre1.start();
        hombre2.start();
        hombre3.start();
        hombre4.start();
        hombre5.start();

        mujer1.start();
        mujer2.start();
        mujer3.start();
        mujer4.start();
        mujer5.start();



    }
}
