package com.company.Ascensor;

public class Edificio {
    public static void main(String[] args) {

        Ascensor ascensor = new Ascensor(0);
        Motor motor = new Motor(5, ascensor);
        Persona persona1 = new Persona("Juan",1,3,ascensor);
        Persona persona2 = new Persona("Alex",4,5,ascensor);
        Persona persona3 = new Persona("Polo",5,0,ascensor);
        Persona persona4 = new Persona("Pablo",1,3,ascensor);
        Persona persona5 = new Persona("Angel",4,5,ascensor);
        Persona persona6 = new Persona("Andrés",5,0,ascensor);

        motor.start();

        persona1.start();
        persona2.start();
        persona3.start();
        persona4.start();
        persona5.start();
        persona6.start();

    }
}
