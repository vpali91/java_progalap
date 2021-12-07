package pkgclass;

import java.util.Random;

public class NPC {
    //az osztály változói

    public String name;
    public String race;
    public int hp;
    public boolean immortal;
    Weapon weapon;

    //construktor, ami paramétereket vár és ez alapján értéket az a változóknak
    public NPC(String name, String race, int hp, boolean immortal) {
        this.name = name;
        this.race = race;
        this.hp = hp;
        this.immortal = immortal;
        this.weapon = new Weapon("Sword", 100, 10, false);
    }

    //metódus visszatérési érték és paraméter nélkül
    public void Speak() {
        String[] quotes = {"I used to be an adventurer like you. Then I took an arrow in the knee.", "Never should have come here!", "Let me guess… someone stole your sweetroll?"};
        var rnd = new Random();
        int random_num = (int) (Math.random() * (2 - 0 + 1) + 0);
        System.out.println(quotes[random_num]);
    }

    public void Injured() {
        hp -= 10;
    }

    //metódus visszatérési értékkel
    public int getHP() {
        return hp;
    }

    //Method overloading: Ha több ugyanolyan nevű metódus létezik, csak különféle típusú paramétereket várnak
    // Mindig az fut le, amelyik fajta paramétert kapta meg.
    public void doSomething(String something) {
        System.out.println("String: " + something);
    }

    public void doSomething(String something, String something2) {
        System.out.println("String: " + something);
    }

    public void doSomething(int something) {
        System.out.println("int: " + something);
    }

    public void doSomething(boolean something) {
        System.out.println("boolean: " + something);
    }
}
