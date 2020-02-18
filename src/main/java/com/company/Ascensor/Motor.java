package com.company.Ascensor;

public class Motor extends Thread{

    Ascensor ascensor;
    int plantaMax;

    Nivel nivel;
    enum Nivel{
        SUBIENDO,
        BAJANDO
    }

    public Motor(int plantaMax,Ascensor ascensor) {
        this.plantaMax = plantaMax;
        this.ascensor = ascensor;
        nivel = Nivel.SUBIENDO;
    }

//    public static void main(String[] args) {
//        for (;;){
//
//        }
//    }

    @Override
    public void run() {
        super.run();
        for (;;){
            switch (nivel){
                case SUBIENDO:
                    try {
                        if(ascensor.plantaActualAscensor<=plantaMax){
                            if(ascensor.plantaActualAscensor==plantaMax){
                                nivel = Nivel.BAJANDO;
                            } else {
                                ascensor.plantaActualAscensor++;
                                ascensor.notificar();
                                System.out.println(ascensor.plantaActualAscensor);

                                Thread.sleep((long)(Math.random() * 3000));
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                case BAJANDO:
                    try {
                        if(ascensor.plantaActualAscensor>=0){
                            if(ascensor.plantaActualAscensor==0){
                                nivel = Nivel.SUBIENDO;
                            } else {
                                ascensor.plantaActualAscensor--;
                                ascensor.notificar();
                                System.out.println(ascensor.plantaActualAscensor);

                                Thread.sleep((long)(Math.random() * 3000));
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            }
        }
    }
}
