package br.com.GFT.Ex01;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> magias = Arrays.asList("bola de fog", "agua");
        Mago mago = new Mago("Harry", 2,3,4.5f,4,5,4, magias);

        System.out.println("Mana antes do lvl" + mago.getMana());
        mago.lvlUp();
        System.out.println("Mana depois do lvl" + mago.getMana());

        System.out.println("Ataque do mago = " + mago.attack());
    }
}
