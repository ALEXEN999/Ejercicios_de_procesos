package com.company.Tejedores;

public class Taller {
    public static void main(String[] args) {
        Cesta cesta_mangas = new Cesta(8);
        Cesta cesta_cuerpos = new Cesta(5);
        Tejedor tejedor_mangas = new Tejedor(cesta_mangas,"Mangas");
        Tejedor tejedor_cuerpos = new Tejedor(cesta_cuerpos,"Cuerpo");
        Ensamblador ensamblador = new Ensamblador(cesta_mangas,cesta_cuerpos,"Pieza");

        tejedor_mangas.start();
        tejedor_cuerpos.start();
        ensamblador.start();
    }
}
