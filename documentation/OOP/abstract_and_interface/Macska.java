public class Macska extends Emlos{
    public Macska(int eletkor, int testsuly) {
        super(eletkor, testsuly);
    }

    @Override
    public String toString() {
        return "Macska{" +
                "eletkor=" + eletkor +
                ", testsuly=" + testsuly +
                ", eletbenVanE=" + eletbenVanE +
                '}';
    }

    public String Karmol() {
        return "Megkarmolt";
    }


}
