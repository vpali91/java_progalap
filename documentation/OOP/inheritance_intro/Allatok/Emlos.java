package allatok;

public class Emlos {

    public int eletkor;
    public int testsuly;
    public boolean eletbenVanE = true;

    public Emlos(int eletkor, int testsuly) {
        this.eletkor = eletkor;
        this.testsuly = testsuly;
    }

    public int Oregszik() {
        return eletkor++;
    }

    public int Eszik() {
        return testsuly++;
    }

    public boolean kill() {
        return eletbenVanE = false;
    }
}
