package aula07;

import java.util.ArrayList;

public class UltraEmojiCombat {

    public static void main(String[] args) {
        ArrayList <Lutador> lutadores = new ArrayList<>(6);
        lutadores.add(new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2,1 ));
        lutadores.add(new Lutador("Putscript", "Brasil", 29, 1.68f,57.8f, 14, 2, 3));
        lutadores.add(new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2 , 1));
        lutadores.add(new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 14, 0, 2));
        lutadores.add(new Lutador("UFOcobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3));
        lutadores.add(new Lutador("Nerdart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4));


        lutadores.get(0).status();
    }
}
