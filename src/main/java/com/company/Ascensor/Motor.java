package com.company.Ascensor;

public class Motor extends Thread{

    Ascensor ascensor;
    int plantaMax;

    int countVueltasVacias = 0;
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

    @Override
    public void run() {
        super.run();
        while (countVueltasVacias != 2){
            switch (nivel){
                case SUBIENDO:
                    try {
                        if(ascensor.plantaActualAscensor<=plantaMax){
                            if(ascensor.plantaActualAscensor==plantaMax){
                                nivel = Nivel.BAJANDO;
                            } else {
                                ascensor.plantaActualAscensor++;
                                ascensor.notificar();
//                                System.out.println(ascensor.plantaActualAscensor);

                                Thread.sleep((long)(Math.random() * 3000));
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case BAJANDO:
                    try {
                        if(ascensor.plantaActualAscensor>=0){
                            if(ascensor.plantaActualAscensor==0){
                                nivel = Nivel.SUBIENDO;
                            } else {
                                ascensor.plantaActualAscensor--;
                                ascensor.notificar();
//                                System.out.println(ascensor.plantaActualAscensor);

                                Thread.sleep((long)(Math.random() * 3000));
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;

            }
            if (ascensor.countPersona==0){
                countVueltasVacias++;
            }

        }
    }
}
