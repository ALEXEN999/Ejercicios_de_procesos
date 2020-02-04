package com.company.FIlosofo;


public class Filosofo extends Thread {
    Tenedor tenedor1;
    Tenedor tenedor2;

    public Filosofo(Tenedor tenedor1,Tenedor tenedor2, String nom) {
        super(nom);
        this.tenedor1 = tenedor1;
        this.tenedor2 = tenedor2;

    }


    @Override
    public void run() {
        super.run();
            for (;;){
                tenedor1.agafar();
                tenedor2.agafar();

                System.out.println(getName()+" ha cogido el "+tenedor1.getNom()+" y el "+tenedor2.getNom());
                System.out.println();
                try {
                    Thread.sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                tenedor1.deixar();
                tenedor2.deixar();
                try {
                    System.out.println(getName()+" a dejado el "+tenedor1.getNom()+" y el "+tenedor2.getNom());
                    System.out.println();
                    Thread.sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }

    }
}
