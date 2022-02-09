package br.com.GFT.Ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends  Personagem{

    List<String> Magia = new ArrayList<>();

    public  void lvlUp() {
        super.setMana(getMana() + 1);
        super.setInteligencia(getInteligencia() + 1);
    }

    public List<String> getMagia() {
        return Magia;
    }

    public int attack() {
        Random random = new Random();
        return (getInteligencia() / 2 *  (getLevel() * getLevel())) + random.nextInt(181);
    }


    public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> magia) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        Magia = magia;
    }
}
