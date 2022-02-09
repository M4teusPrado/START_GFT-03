package br.com.GFT.Ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends  Personagem{

    List<String> habilidades = new ArrayList<>();

    public  void lvlUp() {
        super.setVida(getVida() + 1);
        super.setForca(getForca() + 1);
    }

    public List<String> getHabilidades() {
        return habilidades;
    }


    public int attack() {
        Random random = new Random();
        return (getForca() / 2 *  (getLevel() * getLevel()) ) + random.nextInt(181);
    }

    public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> habilidades) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        this.habilidades = habilidades;
    }
}
