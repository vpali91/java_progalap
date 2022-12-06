public class Kutya extends Emlos implements Uszas {

    protected String nev;
    public Kutya(int eletkor, int testsuly, String nev) {
        super(eletkor, testsuly);
        this.nev = nev;
    }

    public String Ugat() {
        return "Vau";
    }
    public int Eszik(){
        testsuly++;
        testsuly++;
        return testsuly;
    }

    @Override
    public String toString() {
        return "Kutya{" +
                "nev='" + nev + '\'' +
                ", eletkor=" + eletkor +
                ", testsuly=" + testsuly +
                ", eletbenVanE=" + eletbenVanE +
                '}';
    }

    @Override
    public void Uszik() {
        System.out.println("Úszok!");
    }

    @Override
    public void Elmerul() {
        System.out.println("Help!");
    }

    @Override
    public boolean Megfullad() {
        return kill();
    }
}
