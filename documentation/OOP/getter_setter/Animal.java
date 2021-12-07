package gettersetter;

public class Animal {

    private int age;
    private String name;
    private boolean alive;

    public Animal(int ev, String nev, boolean el) {
        this.age = ev;
        this.name = nev;
        this.alive = el;
    }

    public int GetAge() {
        return age;
    }

    public void SetAge(int ev) {
        if (ev > age) {
            age = ev;
        }
    }

    public boolean GetAlive() {
        return alive;
    }

    public void SetAlive(boolean el) {
        alive = el;
    }
}
