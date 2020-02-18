package com.company.Ascensor;

public class Ascensor {
    int plantaActualAscensor;
    int limitePersonas = 10;

    int countPersona = 0;


    public Ascensor(int plantaActualAscensor) {
        this.plantaActualAscensor = plantaActualAscensor;
    }

    synchronized void notificar(){
        notifyAll();
    }


    public synchronized void subirse(int plantaActual){
                try {
                        while (countPersona == limitePersonas || plantaActual != plantaActualAscensor) wait();
                        countPersona++;
                        notifyAll();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

    }

    public synchronized void bajarse(int plantaDestino) {

            try {
                while (countPersona == limitePersonas || plantaDestino != plantaActualAscensor) wait();
                countPersona--;
                notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
