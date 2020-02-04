package com.company.FIlosofo;

public class Mesa {
    public static void main(String[] args) throws InterruptedException {
        Tenedor tenedor1 = new Tenedor("t1");
        Tenedor tenedor2 = new Tenedor("t2");
        Tenedor tenedor3 = new Tenedor("t3");
        Tenedor tenedor4 = new Tenedor("t4");

        Filosofo filosofo1 = new Filosofo(tenedor1, tenedor2, "Leonardo");
        Filosofo filosofo2 = new Filosofo(tenedor2, tenedor3, "Michel Angelo");
        Filosofo filosofo3 = new Filosofo(tenedor3, tenedor4,"Raphael");
        Filosofo filosofo4 = new Filosofo(tenedor4, tenedor1 ,"Donatello");

            filosofo1.start();
            filosofo2.start();
            filosofo3.start();
            filosofo4.start();


        for (int i = 0; i < 4 ; i++) {
            filosofo1.join();
            filosofo2.join();
            filosofo3.join();
            filosofo4.join();
        }




    }
}
