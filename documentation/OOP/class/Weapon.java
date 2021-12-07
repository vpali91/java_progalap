package pkgclass;

public class Weapon {

    String name;
    int hp;
    int damage;
    boolean enchanted;

    public Weapon(String name, int hp, int damage, boolean enchant) {
        this.name = name;
        this.damage = damage;
        this.hp = hp;
        this.enchanted = enchant;
    }

    public Weapon() {
        this.name = "knife";
        this.damage = 5;
        this.hp = 100;
        this.enchanted = false;
    }
}
