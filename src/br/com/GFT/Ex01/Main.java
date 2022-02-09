package br.com.GFT.Ex01;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        //Instaciando Mago
        List<String> magias = Arrays.asList("bola de fog", "agua");
        Mago mago = new Mago("Harry", 2,3,4.5f,4,5,4, magias);

        System.out.println("Mana antes do lvl" + mago.getMana());
        mago.lvlUp();
        System.out.println("Mana depois do lvl" + mago.getMana());

        System.out.println("Ataque do mago = " + mago.attack());


        //Instanciando guerreiro
        List<String> habilidades = Arrays.asList("soco", "chute");
        Guerreiro guerreiro = new Guerreiro("Lord rei", 2,3,4.5f,4,5,4, habilidades);

        System.out.println("força antes do lvl" + guerreiro.getForca());
        guerreiro.lvlUp();
        System.out.println("força depois do lvl" + guerreiro.getForca());

        System.out.println("Ataque do guerreiro = " + guerreiro.attack());
    }
}
