package lists;

public class NPC {
    
    public String name;
    public String race;
    public int hp;
    public boolean immortal;

    public NPC(String name, String race, int hp, boolean immortal) {
        this.name = name;
        this.race = race;
        this.hp = hp;
        this.immortal = immortal;
    }
}
