public abstract class Emlos {
    protected int eletkor;
    protected int testsuly;
    protected boolean eletbenVanE;

    public Emlos(int eletkor, int testsuly) {
        this.eletkor = eletkor;
        this.testsuly = testsuly;
        this.eletbenVanE = true;
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

    @Override
    public abstract String toString();
}
